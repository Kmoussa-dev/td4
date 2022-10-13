package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Batiment {

    @Id
    private int idBatiment;

    @ManyToOne
    private UFR batiments;

    @OneToMany
    private Salle salles;
}
