package com.system.Bookshop.Controller;


import com.system.Bookshop.Repository.OrderRepo;
import com.system.Bookshop.Repository.ProductRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/order-product")

public class OrderProductController {

    private ProductRepo productRepo;
    private OrderRepo orderRepo;




}
