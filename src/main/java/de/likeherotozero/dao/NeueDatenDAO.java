package de.likeherotozero.dao;

import java.util.List;

import de.likeherotozero.model.NeueDaten;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class NeueDatenDAO {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("likeherotozero");

    private EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
    // Alle NeueDaten laden
    public List<NeueDaten> findeAlle() {
        try (EntityManager em = getEntityManager()) {
            return em.createQuery("SELECT n FROM NeueDaten n", NeueDaten.class).getResultList();
        }
    }

    // neuen NeueDaten erstellen
    public void createNeueDaten(NeueDaten neueDaten){
        EntityManager em = getEntityManager();
        EntityTransaction t = em.getTransaction();
        try {
            t.begin();
            em.persist(neueDaten);
            t.commit();
        } catch (Exception e) {
            t.rollback();
            throw e;
        }finally{
            em.close();
        }
    }

    // Bestimmten NeueDaten laden
    public NeueDaten findeNeueDaten(int id) {
        try (EntityManager em = getEntityManager()) {
            return em.find(NeueDaten.class, id);
        }
    }

    // vorhandenen NeueDaten aktualisieren
    public void updateNeueDaten(NeueDaten neueDaten){
        EntityManager em = getEntityManager();
        EntityTransaction t = em.getTransaction();
        try {
            t.begin();
            em.merge(neueDaten);
            t.commit();
        } catch (Exception e) {
            t.rollback();
            throw e;
        }finally{
            em.close();
        }
    }

    // bestehenden NeueDaten löschen
    public void deleteNeueDaten(NeueDaten neueDaten){
        EntityManager em = getEntityManager();
        EntityTransaction t = em.getTransaction();
        try {
            t.begin();
            NeueDaten deleteNeueDaten = em.find(NeueDaten.class, neueDaten.getId());
            if(deleteNeueDaten != null){
                em.remove(deleteNeueDaten);
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
