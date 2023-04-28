package com.system.Bookshop.Service;

import com.system.Bookshop.Entity.Order;
import com.system.Bookshop.Repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepo orderRepo;

    @Override
    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }

    @Override
    public Order saveOrder(Order order) {
        return orderRepo.save(order);
    }

}
