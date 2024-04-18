package ua.vholovetskyi.onlinestore.order.db;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.vholovetskyi.onlinestore.order.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
