package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Groupe {

    @Id
    private int idGroupe;

    private String intitule;

    @OneToMany
    private List<Creneau> creneaux;

    @ManyToMany(mappedBy = "appartient")
    private List<Etudiant> membres;

    @ManyToMany(mappedBy = "groupes")
    private List<Formation> etudiantsDe;
}
