package de.likeherotozero.model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "benutzer")
public class Benutzer {

    @Id
    @Column(name = "Benutzername")
    private String benutzername;

    @Column(name = "Rolle")
    private boolean rolle;

    @Column(name = "Passwort")
    private String passwort;

    // Getter und Setter
    public String getBenutzername() { 
        return benutzername; 
    }
    public void setBenutzername(String benutzername) { 
        this.benutzername = benutzername;
    }

    public boolean isRolle() {
        return rolle;
    }
    public void setRolle(boolean rolle) {
        this.rolle = rolle;
    }

    public String getPasswort() { 
        return passwort; 
    }
    public void setPasswort(String klartextPasswort) { 
        this.passwort = hashPasswort(klartextPasswort); 
    }

    // Funktion zum hashen der Passworteingabe
    public static String hashPasswort(String klartextPasswort) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(klartextPasswort.getBytes());

            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
            // Rückgabe des gehashten Passwortes
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Fehlöer beim hashen des Passworts", e);
        }
    }

    public boolean pruefePasswort(String passwort) {
        return this.passwort.equals(hashPasswort(passwort));
    }
}
