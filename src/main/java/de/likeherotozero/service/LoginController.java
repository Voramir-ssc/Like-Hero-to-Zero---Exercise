package de.likeherotozero.service;

import java.io.Serializable;

import de.likeherotozero.dao.BenutzerDAO;
import de.likeherotozero.model.Benutzer;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("loginController")
@ViewScoped
public class LoginController implements Serializable {
    private String benutzername;
    private String passwort;

    @Inject
    private BenutzerDAO benutzerDAO;

    public Benutzer versucheLogin() {
        Benutzer benutzer = benutzerDAO.findeBenutzer(benutzername);
        if (benutzer != null && benutzer.pruefePasswort(passwort)) {
            return benutzer;
        } 
        return null;
    }

    // Getter und Setter
    public String getBenutzername() {
        return benutzername;
    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    } 
}
