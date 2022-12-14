package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Salle {

    @Id
    private String numSalle;

    private int capacite;


    @OneToMany(mappedBy = "dans")
    private List<Creneau> occupation;

    @ManyToMany(mappedBy = "reserve")
    private List<Formation> reserveA;


}
