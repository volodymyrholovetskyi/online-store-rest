package ua.vholovetskyi.onlinestore.order.db;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.vholovetskyi.onlinestore.order.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
