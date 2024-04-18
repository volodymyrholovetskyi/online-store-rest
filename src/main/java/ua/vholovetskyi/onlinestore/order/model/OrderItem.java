package ua.vholovetskyi.onlinestore.order.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import ua.vholovetskyi.onlinestore.commons.jpa.BaseEntity;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class OrderItem extends BaseEntity {

    private String item;
    private BigDecimal price;
    private int quantity;
    private Long orderId;
}
