package ua.vholovetskyi.onlinestore.order.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.vholovetskyi.onlinestore.order.db.OrderRepository;

@Service
@RequiredArgsConstructor
public class OrderService {

    private OrderRepository orderRepository;
}
