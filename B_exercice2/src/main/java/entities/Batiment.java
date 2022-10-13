package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Batiment {

    @Id
    private int idBatiment;

    @ManyToOne
    private UFR batiments;

    @OneToMany
    private List<Salle> salles;
}
