package de.likeherotozero.dao;

import java.util.List;

import de.likeherotozero.model.Benutzer;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@ApplicationScoped
public class BenutzerDAO {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("likeherotozero");

    private EntityManager getEntityManager(){
        return emf.createEntityManager();
    }

    // Alle Benutzer laden
    public List<Benutzer> findeAlle() {
        try (EntityManager em = getEntityManager()) {
            return em.createQuery("SELECT e FROM Eintrag e", Benutzer.class).getResultList();
        }
    }

    // neuen Benutzer erstellen
    public void createBenutzer(Benutzer benutzer){
        EntityManager em = getEntityManager();
        EntityTransaction t = em.getTransaction();
        try {
            t.begin();
            em.persist(benutzer);
            t.commit();
        } catch (Exception e) {
            t.rollback();
            throw e;
        }finally{
            em.close();
        }
    }

    // Bestimmten Benutzer laden
    public Benutzer findeBenutzer(String benutzername) {
        try (EntityManager em = getEntityManager()) {
            return em.find(Benutzer.class, benutzername);
        }
    }

    // vorhandenen Benutzer aktualisieren
    public void updateBenutzer(Benutzer benutzer){
        EntityManager em = getEntityManager();
        EntityTransaction t = em.getTransaction();
        try {
            t.begin();
            em.merge(benutzer);
            t.commit();
        } catch (Exception e) {
            t.rollback();
            throw e;
        }finally{
            em.close();
        }
    }

    // bestehenden Benutzer löschen
    public void deleteBenutzer(Benutzer benutzer){
        EntityManager em = getEntityManager();
        EntityTransaction t = em.getTransaction();
        try {
            t.begin();
            Benutzer deleteBenutzer = em.find(Benutzer.class, benutzer.getBenutzername());
            if(deleteBenutzer != null){
                em.remove(deleteBenutzer);
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