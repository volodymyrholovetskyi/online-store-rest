package ua.vholovetskyi.onlinestore.order.model;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * @author Volodymyr Holovetskyi
 * @version 1.0
 * @since 2024-04-5
 */
public enum OrderStatus {

    NEW, PAID, CANCELED, SHIPPED;

    public static OrderStatus parseString(String value) {
        return Arrays.stream(values())
                .filter(it -> StringUtils.equalsIgnoreCase(it.name(), value))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unsupported: [%s] attribute!".formatted(value)));
    }
}
