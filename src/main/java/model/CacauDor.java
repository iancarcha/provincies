package model;

import jakarta.persistence.*;

@Entity
public class CacauDor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String descripcio;

    @ManyToOne
    @JoinColumn(name = "intermitja_id")
    private Intermitja intermitja;

   @ManyToOne
   @JoinColumn(name = "pais_id")
   private Pais pais;

   @ManyToOne
   @JoinColumn(name = "provincia_id")
    private Provincia provincia;

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

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public Intermitja getIntermitja() {
        return intermitja;
    }

    public void setIntermitja(Intermitja intermitja) {
        this.intermitja = intermitja;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public CacauDor(Long id, String nom, String descripcio, Intermitja intermitja, Pais pais, Provincia provincia) {
        this.id = id;
        this.nom = nom;
        this.descripcio = descripcio;
        this.intermitja = intermitja;
        this.pais = pais;
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "CacauDor{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", descripcio='" + descripcio + '\'' +
                ", intermitja=" + intermitja +
                ", pais=" + pais +
                ", provincia=" + provincia +
                '}';
    }
}
