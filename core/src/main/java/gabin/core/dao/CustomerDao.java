package gabin.core.dao;


import gabin.core.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Class description
 *
 * @author linjiabin on  16/5/29
 */
public interface CustomerDao extends JpaRepository<Customer, Long> {
}
