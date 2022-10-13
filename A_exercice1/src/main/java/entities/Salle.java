package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Salle {

    @Id
    private String numSalle;

    private int capacite;

    @OneToMany
    private List<Creneau> occupation;
}
