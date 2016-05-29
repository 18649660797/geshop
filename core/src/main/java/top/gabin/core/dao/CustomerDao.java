package top.gabin.core.dao;


import top.gabin.core.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Class description
 *
 * @author linjiabin on  16/5/29
 */
public interface CustomerDao extends JpaRepository<Customer, Long> {
}
