package com.system.Bookshop.Service;

import com.system.Bookshop.Entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {

    public Order saveOrder(Order order);

    public List<Order> getAllOrders();

}
