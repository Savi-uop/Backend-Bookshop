package com.system.Bookshop.Service;

import com.system.Bookshop.Entity.Agent;
import com.system.Bookshop.Entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {

    public Customer saveCustomer(Customer customer);

    public List<Customer> getAllCustomers();

}
