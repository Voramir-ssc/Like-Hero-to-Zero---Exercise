package de.likeherotozero.dao;

import java.util.List;

import de.likeherotozero.model.Co2Daten;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Co2DatenDAO {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("likeherotozero");

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    // Alle Co2Daten laden
    public List<Co2Daten> findeAlle() {
        try (EntityManager em = getEntityManager()) {
            return em.createQuery("SELECT e FROM Co2Daten e", Co2Daten.class).getResultList();
        }
    }

    // neuen Co2Daten erstellen
    public void createCo2Daten(Co2Daten co2Daten){
        EntityManager em = getEntityManager();
        EntityTransaction t = em.getTransaction();
        try {
            t.begin();
            em.persist(co2Daten);
            t.commit();
        } catch (Exception e) {
            t.rollback();
            throw e;
        }finally{
            em.close();
        }
    }

    // Bestimmten Co2Daten laden
    public Co2Daten findeCo2Daten(Integer jahr) {
        try (EntityManager em = getEntityManager()) {
            return em.find(Co2Daten.class, jahr);
        }
    }

    // vorhandenen Co2Daten aktualisieren
    public void updateCo2Daten(Co2Daten co2Daten){
        EntityManager em = getEntityManager();
        EntityTransaction t = em.getTransaction();
        try {
            t.begin();
            em.merge(co2Daten);
            t.commit();
        } catch (Exception e) {
            t.rollback();
            throw e;
        }finally{
            em.close();
        }
    }

    // bestehenden Co2Daten löschen
    public void deleteCo2Daten(Co2Daten co2Daten){
        EntityManager em = getEntityManager();
        EntityTransaction t = em.getTransaction();
        try {
            t.begin();
            Co2Daten deleteCo2Daten = em.find(Co2Daten.class, co2Daten.getJahr());
            if(deleteCo2Daten != null){
                em.remove(deleteCo2Daten);
            }
            t.commit();
        } catch (Exception e) {
            t.rollback();
            throw e;
        } finally {
            em.close();
        }
    }
}
