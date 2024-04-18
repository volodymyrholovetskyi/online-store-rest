package ua.vholovetskyi.onlinestore.order.model;

import jakarta.persistence.*;
import lombok.*;
import ua.vholovetskyi.onlinestore.commons.jpa.BaseEntity;

import java.util.Set;

/**
 * @author Volodymyr Holovetskyi
 * @version 1.0
 * @since 2024-04-5
 */
@Getter
@Setter
@Table(name = "orders")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order extends BaseEntity {


    @OneToMany
    @JoinColumn(name = "orderId")
    private Set<OrderItem> items;
    private Long customerId;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
