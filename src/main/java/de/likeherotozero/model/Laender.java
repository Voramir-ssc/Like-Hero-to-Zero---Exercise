package de.likeherotozero.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "countrys")
public class Laender {
    @Id
    @Column (name = "ISO")
    private String iso;
    
    @Column (name = "Country")
    private String name;

    // Getter und Setter
    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
