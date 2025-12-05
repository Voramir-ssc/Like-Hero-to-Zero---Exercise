package de.likeherotozero.beans;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import de.likeherotozero.dao.Co2DatenDAO;
import de.likeherotozero.dao.LaenderDAO;
import de.likeherotozero.model.Co2Daten;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@Named
@ViewScoped
public class Co2DatenBean implements Serializable{
    private List<Co2Daten> eintraege;
    
    private Co2Daten aktuellerEintrag = new Co2Daten();
    private final Co2DatenDAO dao = new Co2DatenDAO();
    private final LaenderDAO laenderDAO = new LaenderDAO();
    
    // Benötigt für die dynamische Tabellenerstellung
    private final Map<String, Function<Co2Daten, BigDecimal>> getterMap = new LinkedHashMap<>();
    private final Map<Co2Daten, Map<String, BigDecimal>> datenMap = new HashMap<>();
    private LinkedHashMap<String, String> laenderNamen;
    private List<String> isos;
    private List<String> auswahlIsos;
    
    public Co2DatenBean() {};
    
    @PostConstruct
    public void init(){
        eintraege = dao.findeAlle();
        isos = laenderDAO.findeAlleIso();
        laenderNamen = laenderDAO.findeAlleIsoMitNamen();
        // Sortiert die ISos alphabetisch
        Collections.sort(isos);
        // Getter-Map erstellen um dynamisch auf die Werte zugreifen zu können
        for (String iso : isos) {
            try {
                // Umwandlung von DEU zu getDeu
                String getterName = "get" + iso.substring(0,1).toUpperCase() + iso.substring(1).toLowerCase();
                Method getterMethode = Co2Daten.class.getMethod(getterName);
                getterMap.put(iso.toLowerCase(), co2daten -> {
                    try {
                        return (BigDecimal) getterMethode.invoke(co2daten);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        System.out.println("Fehler bei getterMethode: " + e);
                        return null;
                    }
                });
            } catch (NoSuchMethodException e) {
                // ggf. Fehlernachricht
                System.out.println("Kein Getter für ISO: " + iso);
            }      
        }
        for (Co2Daten daten : eintraege) {
            Map<String, BigDecimal> isoWerte = new LinkedHashMap<>();
            for (String iso : isos) {
                Function<Co2Daten, BigDecimal> getter = getterMap.get(iso.toLowerCase());
                if (getter != null) {
                    isoWerte.put(iso, getter.apply(daten));
                }
            }
            datenMap.put(daten, isoWerte);
        }
        auswahlIsos = new ArrayList<>(isos);
    }

    public void save(){
        if(aktuellerEintrag.getJahr() == null){
            dao.createCo2Daten(aktuellerEintrag);
        } else{
            dao.updateCo2Daten(aktuellerEintrag);
        }

        eintraege = dao.findeAlle();
        aktuellerEintrag = new Co2Daten();
    }

    public void change(Co2Daten eintrag){
        this.aktuellerEintrag = eintrag;
    }

    public void delete(Co2Daten eintrag){
        if (eintrag == null){
            System.err.println("Achtung: co2Daten ist null!");
        }
        dao.deleteCo2Daten(eintrag);
        eintraege = dao.findeAlle();
    }

    // Getter und Setter
    public BigDecimal getWert(Co2Daten daten, String iso) {
        Function<Co2Daten, BigDecimal> getter = getterMap.get(iso.toLowerCase());
        if (getter != null) {
            return getter.apply(daten);
        }
        return null;
    }

    public List<Co2Daten> getEintraege() {
        return eintraege;
    }
    
    public Co2Daten getAktuellerEintrag(){
        return aktuellerEintrag;
    }
    public void setAktuellerEintrag(Co2Daten aktuellerEintrag){
        this.aktuellerEintrag = aktuellerEintrag;
    }

    public List<String> getIsos() {
        return isos;
    }

    public LinkedHashMap<String, String> getLaenderNamen() {
        return laenderNamen;
    }

    public Map<String, Function<Co2Daten, BigDecimal>> getGetterMap() {
        return getterMap;
    }

    public Map<Co2Daten, Map<String, BigDecimal>> getDatenMap() {
        return datenMap;
    }

    public List<String> getAuswahlIsos() {
        return auswahlIsos;
    }

    public void setAuswahlIsos(List<String> auswahlIsos) {
        this.auswahlIsos = auswahlIsos;
    }

}