package com.example.provincies;

import jakarta.persistence.*;
@Entity
public class Ciutat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @ManyToOne
    @JoinColumn(name = "provincia_id")
    private Provincia provincia;

    public Ciutat(Long id, String nom, Provincia provincia) {
        this.id = id;
        this.nom = nom;
        this.provincia = provincia;
    }

    public Ciutat() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
}
