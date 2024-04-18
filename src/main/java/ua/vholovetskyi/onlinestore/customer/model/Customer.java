package ua.vholovetskyi.onlinestore.customer.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;
import ua.vholovetskyi.onlinestore.commons.jpa.BaseEntity;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author Volodymyr Holovetskyi
 * @version 1.0
 * @since 2024-04-5
 */
@Getter
@Setter
@ToString
@Table(name = "customer")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer extends BaseEntity {

    private String email;
    private String firstName;
    private String lastName;
    private String phone;
    private String street;
    private String city;
    private String zipCod;

}
