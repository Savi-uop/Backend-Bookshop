package com.system.Bookshop.Repository;

import com.system.Bookshop.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<Order,Integer> {

   // List<Order> findByOrderId(int id);
   // List<Order> findByOrderLessThan(double amount);


}
