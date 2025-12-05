package de.likeherotozero.beans;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import de.likeherotozero.dao.Co2DatenDAO;
import de.likeherotozero.dao.NeueDatenDAO;
import de.likeherotozero.model.Co2Daten;
import de.likeherotozero.model.NeueDaten;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@Named
@ViewScoped
public class NeueDatenBean implements Serializable{
    private List<NeueDaten> eintraege;

    private NeueDaten aktuellerEintrag = new NeueDaten();
    private final NeueDatenDAO dao = new NeueDatenDAO();
    private final Co2DatenDAO co2dao = new Co2DatenDAO();
    private Co2Daten co2Daten;

    public NeueDatenBean() {};

    @PostConstruct
    public void init(){
        eintraege = dao.findeAlle();
    }

    public void save(){
        if(aktuellerEintrag.getJahr() == null){
            dao.createNeueDaten(aktuellerEintrag);
        } else{
            dao.updateNeueDaten(aktuellerEintrag);
        }

        eintraege = dao.findeAlle();
        aktuellerEintrag = new NeueDaten();
    }

    // Tansformiert die Daten von NeueDaten zu Co2Daten zur speicherung in die DB
    public void transform(NeueDaten eintrag){
        co2Daten = co2dao.findeCo2Daten(eintrag.getJahr());
        if(co2Daten != null){
            // Wenn ein Eintrag für das Jahr existiert, ändere den Wert
            setWert(co2Daten, eintrag.getIso(), eintrag.getWert());
            co2dao.updateCo2Daten(co2Daten);
        } else{
            // Wenn kein Eintrag für das Jahr existiert, lege neuen Wert an
            co2Daten = new Co2Daten();
            co2Daten.setJahr(eintrag.getJahr());
            setWert(co2Daten, eintrag.getIso(), eintrag.getWert());
            co2dao.createCo2Daten(co2Daten);
        }
        LocalDateTime zeitObjekt = LocalDateTime.now();  
        DateTimeFormatter zeitObjektFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        
        String formatierteZeit = zeitObjekt.format(zeitObjektFormat);  
        eintrag.setBemerkung("EINTRAG GENEHMIGT: " + formatierteZeit);
        dao.updateNeueDaten(eintrag);
        eintraege = dao.findeAlle();
    }

    public void change(NeueDaten eintrag){
        this.aktuellerEintrag = eintrag;
    }

    public void delete(NeueDaten eintrag){
        dao.deleteNeueDaten(eintrag);
        eintraege = dao.findeAlle();
    }

    public List<NeueDaten> getEintraege() {
        return eintraege;
    }
    
    public NeueDaten getAktuellerEintrag(){
        return aktuellerEintrag;
    }
    public void setAktuellerEintrag(NeueDaten aktuellerEintrag){
        this.aktuellerEintrag = aktuellerEintrag;
    }

    // Funktion um Wert aus dieser in andere BEan zu überführen
    public void setWert(Co2Daten co2Daten, String iso, BigDecimal wert){
        try {
            String setterName = "set" + iso.substring(0,1).toUpperCase() + iso.substring(1).toLowerCase();
            Method setterMethode = Co2Daten.class.getMethod(setterName, BigDecimal.class);
            setterMethode.invoke(co2Daten, wert);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            // ggf. Fehlernachricht
            System.out.println("Fehler beim Setzen des Wertes für " + iso +": " + e.getMessage());
        }
    }
}
