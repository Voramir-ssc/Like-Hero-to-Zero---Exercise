package de.likeherotozero.dao;

import java.util.LinkedHashMap;
import java.util.List;

import de.likeherotozero.model.Laender;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class LaenderDAO {
     private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("likeherotozero");

    private EntityManager getEntityManager(){
        return emf.createEntityManager();
    }

    // Funktion für Ländernamen Zuordnung
    public List<String> findeAlleIso() {
        try (EntityManager em = getEntityManager()){
            return em.createQuery("SELECT l.iso FROM Laender l", String.class).getResultList();
        } 
    }

    public LinkedHashMap<String, String> findeAlleIsoMitNamen() {
        List<String> isos = findeAlleIso();
        LinkedHashMap<String, String> spaltenMitNamen = new LinkedHashMap<>();
        try (EntityManager em = getEntityManager()) {
            for (String iso : isos) {
                spaltenMitNamen.put(iso, em.find(Laender.class, iso).getName());
            }
        }
        return spaltenMitNamen;
    }
}
