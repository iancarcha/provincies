package model;

import jakarta.persistence.*;
import model.Provincia;

import java.util.List;
@Entity
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @OneToMany(mappedBy = "pais",cascade = CascadeType.ALL)
    private List<Provincia> provincias;

    @Override
    public String toString() {
        return "Pais{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", provincias=" + provincias +
                '}';
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
