package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Creneau {

    @Id
    private int creneau;

    private LocalDateTime debut;

    private LocalDateTime fin;

    @ManyToOne
    private Salle dans;
}
