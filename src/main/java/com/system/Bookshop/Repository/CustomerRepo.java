package com.system.Bookshop.Repository;

import com.system.Bookshop.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {



}
