package com.system.Bookshop.Controller;

import com.system.Bookshop.Entity.Order;
import com.system.Bookshop.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/getOrders")
    public List<Order> getALlOrders(){
        return orderService.getAllOrders();
    }

    @PostMapping("/saveOrder")
    public String saveOrder(@RequestBody Order order){
        orderService.saveOrder(order);
        return "New Order Placed";
    }


}
