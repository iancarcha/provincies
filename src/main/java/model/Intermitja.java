package model;

import jakarta.persistence.*;
import model.CacauDor;
import model.Ciutat;

import java.util.List;

@Entity
public class Intermitja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "intermitja",cascade = CascadeType.ALL)
    private List<CacauDor> cacauDorList;

    @OneToMany(mappedBy = "intermitja",cascade = CascadeType.ALL)
    private List<Ciutat> ciutatList;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<CacauDor> getCacauDorList() {
        return cacauDorList;
    }

    public void setCacauDorList(List<CacauDor> cacauDorList) {
        this.cacauDorList = cacauDorList;
    }

    public List<Ciutat> getCiutatList() {
        return ciutatList;
    }

    public void setCiutatList(List<Ciutat> ciutatList) {
        this.ciutatList = ciutatList;
    }

    public Intermitja(Long id, List<CacauDor> cacauDorList, List<Ciutat> ciutatList) {
        this.id = id;
        this.cacauDorList = cacauDorList;
        this.ciutatList = ciutatList;
    }

    @Override
    public String toString() {
        return "Intermitja{" +
                "id=" + id +
                ", cacauDorList=" + cacauDorList +
                ", ciutatList=" + ciutatList +
                '}';
    }
}
