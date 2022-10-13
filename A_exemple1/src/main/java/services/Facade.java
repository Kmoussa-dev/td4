package services;

import entities.Employe;
import entities.Machine;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Collection;

@Service
public class Facade {
    @PersistenceContext
    EntityManager em;

    @Transactional
    public void createEmploye(String prenom, String nom) {
        Employe emp=new Employe(prenom,nom);
        em.persist(emp);
    }

    public Collection<Employe> findAllEmploye() {
        return em.createQuery("From Employe e").getResultList();
    }

    @Transactional
    public void addMachine() {
        Machine m=new Machine();
        m.setModele("IBM PC");
        m.setAdresseMac("00:00:00:00:00");
        em.persist(m);

        Employe jv=em.find(Employe.class,1);
        m.setAffecteeA(jv);
        jv.setMachine(m);
    }

}
