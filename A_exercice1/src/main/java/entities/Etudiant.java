package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Etudiant {

    @Id
    private String numEtudiant;

    private String prenom;

    private String nom;

    @ManyToMany
    @JoinTable(name="appartient",
            joinColumns = {@JoinColumn(name="numEtudiant")},
            inverseJoinColumns = {@JoinColumn(name="idGroupe")})
    private List<Groupe> appartient;

    @ManyToMany
    @JoinTable(name="inscrits",
            joinColumns = {@JoinColumn(name="numEtudiant")},
            inverseJoinColumns = {@JoinColumn(name="idForm")})
    private List<Formation> inscrits;


}
