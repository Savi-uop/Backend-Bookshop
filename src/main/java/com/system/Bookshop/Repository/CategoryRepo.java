package com.system.Bookshop.Repository;

import com.system.Bookshop.Entity.Category;
import com.system.Bookshop.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Integer> {

//    List<Category> findByCategoryId(int id);

//    @Query("SELECT p FROM Product p WHERE p.category = ?1")
//    List<Product> getProductsByCategory(Integer id);

}
