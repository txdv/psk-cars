package lt.vu.usecases.cdi.dao;

import lt.vu.entities.Owner;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class OwnerDAO {
    @Inject
    private EntityManager em;

    public void create(Owner owner) {
        em.persist(owner);
    }

    public List<Owner> getAllUniversities() {
        return em.createNamedQuery("Owner.findAll", Owner.class).getResultList();
    }
}
