package lt.vu.usecases.cdi.simple;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import lt.vu.entities.Car;
import lt.vu.entities.Insurance;
import lt.vu.entities.Owner;
import lt.vu.usecases.cdi.dao.InsuranceDAO;
import lt.vu.usecases.cdi.dao.CarDAO;
import lt.vu.usecases.cdi.dao.OwnerDAO;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Model // tas pats kaip: @Named ir @RequestScoped
@Slf4j
public class RequestUseCaseControllerJPA {

    @Getter
    private Owner owner = new Owner();
    @Getter
    private Car car = new Car();
    @Getter
    private Insurance insurance = new Insurance();

    @Getter
    private List<Insurance> allInsurances;

    @PostConstruct
    public void init() {
        loadAllInsurances();
    }

    @Inject
    private OwnerDAO ownerDAO;
    @Inject
    private InsuranceDAO insuranceDAO;
    @Inject
    private CarDAO carDAO;

    @Transactional
    public void createCourseStudent() {
        car.getInsuranceList().add(insurance);
        insurance.getCarList().add(car);
        car.setOwner(owner);

        ownerDAO.create(owner);
        carDAO.create(car);
        insuranceDAO.create(insurance);

        log.info("Maybe OK...");
    }

    private void loadAllInsurances() {
        allInsurances = insuranceDAO.getAllInsurances();
    }
}
