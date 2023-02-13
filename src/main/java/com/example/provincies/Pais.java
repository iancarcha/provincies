package com.example.provincies;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @OneToMany(mappedBy = "pais",cascade = CascadeType.ALL)
    private List<Provincia> provincias;

    public Pais(Long id, String nom, List<Provincia> provincias) {
        this.id = id;
        this.nom = nom;
        this.provincias = provincias;
    }

    public Pais() {

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

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(List<Provincia> provincias) {
        this.provincias = provincias;
    }
}
