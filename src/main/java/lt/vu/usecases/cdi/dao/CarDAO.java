package lt.vu.usecases.cdi.dao;

import lt.vu.entities.Car;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class CarDAO {
    @Inject
    private EntityManager em;

    public void create(Car car) {
        em.persist(car);
    }
    public void updateAndFlush(Car student) {
        em.merge(student);
        em.flush();
    }

    public List<Car> getAllCars() {
        return em.createNamedQuery("Car.findAll", Car.class).getResultList();
    }

    public Car findById(Integer id) {
        return em.find(Car.class, id);
    }
}
