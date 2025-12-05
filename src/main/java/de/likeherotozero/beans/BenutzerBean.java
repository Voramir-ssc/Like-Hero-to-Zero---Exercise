package de.likeherotozero.beans;

import java.io.Serializable;

import de.likeherotozero.model.Benutzer;
import de.likeherotozero.service.LoginController;
import de.likeherotozero.service.NavigationController;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@SessionScoped
public class BenutzerBean implements Serializable {
    
    private Benutzer angemeldeterBenutzer;
    
    @Inject
    private LoginController loginController;
    @Inject
    private NavigationController navigation;

    public BenutzerBean() {};

    // Getter und Setter
    public Benutzer getAngemeldeterBenutzer() {
        return angemeldeterBenutzer;
    }

    public void setAngemeldeterBenutzer(Benutzer angemeldeterBenutzer) {
        this.angemeldeterBenutzer = angemeldeterBenutzer;
    }

    public boolean isEingeloggt() {
        return angemeldeterBenutzer != null;
    }

    public boolean isAdmin() {
        return isEingeloggt() && angemeldeterBenutzer.isRolle();
    }

    // Login
    public String login() {
        // Benutzer aus DB Laden
        Benutzer benutzer = loginController.versucheLogin();
        if (benutzer != null) {
            System.out.println("Benutzer nicht NULL");
            // Weiterleitung
            angemeldeterBenutzer = benutzer;
            if (angemeldeterBenutzer.isRolle()){
                System.out.println("Benutzer ist Admin");
                return navigation.ladeEdit() + "?faces-redirect=true";
            } else {
                System.out.println("Benutzer ist User");
                return navigation.ladeHome() + "?faces-redirect=true";
            }
        } else {
            // Fehlernachricht
            System.out.println("Benutzer ist NULL");
            return navigation.ladeError() + "?faces-redirect=true";
        }
    }
    
    // Logout
    public String logout() {
        angemeldeterBenutzer = null;
        System.out.println("abmeldung wurde aktiviert");
        return navigation.ladeStart() + "?faces-redirect=true";
    }
}
