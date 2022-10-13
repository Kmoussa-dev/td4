package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class UFR {

    @Id
    private int idUFR;

    @OneToMany(mappedBy = "batiments")
    private List<Batiment> gerePar;
}
