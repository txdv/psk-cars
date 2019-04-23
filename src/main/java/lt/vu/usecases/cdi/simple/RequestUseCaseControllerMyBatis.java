package lt.vu.usecases.cdi.simple;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import lt.vu.usecases.mybatis.dao.*;
import lt.vu.usecases.mybatis.model.*;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Model // tas pats kaip: @Named ir @RequestScoped
@Slf4j
public class RequestUseCaseControllerMyBatis {

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
    private OwnerMapper ownerMapper;
    @Inject
    private CarMapper carMapper;
    @Inject
    private InsuranceMapper insuranceMapper;

    @Transactional
    public void createCourseStudent() {
        ownerMapper.insert(owner);
        car.setOwnerId(owner.getId());
        carMapper.insert(car);

        log.info("Maybe OK...");
    }

    private void loadAllInsurances() {
        allInsurances = insuranceMapper.selectAll();
    }
}