package ua.vholovetskyi.onlinestore.customer.db;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.vholovetskyi.onlinestore.customer.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
