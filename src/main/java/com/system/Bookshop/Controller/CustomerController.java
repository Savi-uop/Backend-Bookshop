package com.system.Bookshop.Controller;


import com.system.Bookshop.Entity.Customer;
import com.system.Bookshop.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/customer")
@CrossOrigin
public class CustomerController {


    @Autowired
    private CustomerService customerService;

    @GetMapping("/getCustomers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
        return "new customer is added" ;
    }

}
