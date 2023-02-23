package model;

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

    @ManyToOne
    @JoinColumn(name = "intermitja_id")
    private Intermitja intermitja;

    public Ciutat(Long id, String nom, Provincia provincia, Intermitja intermitja) {
        this.id = id;
        this.nom = nom;
        this.provincia = provincia;
        this.intermitja = intermitja;
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

    public Intermitja getIntermitja() {
        return intermitja;
    }

    public void setIntermitja(Intermitja intermitja) {
        this.intermitja = intermitja;
    }

    @Override
    public String toString() {
        return "Ciutat{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", provincia=" + provincia +
                ", intermitja=" + intermitja +
                '}';
    }
}
