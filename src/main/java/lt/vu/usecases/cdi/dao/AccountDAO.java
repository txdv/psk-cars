package lt.vu.usecases.cdi.dao;

import lt.vu.entities.Account;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

@Repository
public interface AccountDAO extends EntityRepository<Account, Integer> {

    Account findByUserName(String userName);

}
