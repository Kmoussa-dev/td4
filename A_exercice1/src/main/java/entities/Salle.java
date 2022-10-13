package entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Salle {

    @Id
    private String numSalle;

    private int capacite;


}
