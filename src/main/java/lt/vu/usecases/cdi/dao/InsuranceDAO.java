package lt.vu.usecases.cdi.dao;

import lt.vu.entities.Insurance;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class InsuranceDAO {
    @Inject
    private EntityManager em;

    public void create(Insurance insurance) {
        em.persist(insurance);
    }

    public List<Insurance> getAllInsurances() {
        return em.createNamedQuery("Insurance.findAll", Insurance.class).getResultList();
    }
}
