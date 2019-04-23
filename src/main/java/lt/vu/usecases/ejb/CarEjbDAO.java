package lt.vu.usecases.ejb;

import lt.vu.entities.Car;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.SynchronizationType;
import java.util.List;

@Stateless
public class CarEjbDAO {
    @PersistenceContext(synchronization = SynchronizationType.UNSYNCHRONIZED)
    private EntityManager em;

    public void create(Car car) {
        em.persist(car);
    }

    public List<Car> getAllCars() {
        return em.createNamedQuery("Car.findAll", Car.class).getResultList();
    }
}
