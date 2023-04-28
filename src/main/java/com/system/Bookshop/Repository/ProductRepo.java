package com.system.Bookshop.Repository;


import com.system.Bookshop.Entity.Product;
import com.system.Bookshop.Entity.ProductNew;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {


//    List<Product> findByProductId(int id);

//    List<Product> findByProductName(String name);



//        @Query(value = "SELECT * FROM product p JOIN p.category c JOIN c.sub_category s" + " WHERE p.category =?1 ",nativeQuery = true)
//        @Query(value = "SELECT * FROM product WHERE id =?1" , nativeQuery = true)
//          @Query("select p from product p inner join p.category c where c.id = p.category ")
//        Product getProductByCategory(Integer cat_id);

//        @Query(value = "SELECT * FROM Product WHERE id = ?1 AND category = ?2" , nativeQuery = true)
//      List<Product> getProductByCategory(Integer id);
//        @Query(value = "SELECT * FROM product WHERE product.category = ?1" , nativeQuery = true)
//        Product getProductByCategory(Integer id,Integer category);

        //not working
        @Query(value = "SELECT * FROM product WHERE category = ?1" ,nativeQuery = true)
        Product getProductByCategory(Integer id);

        // not working
        // ,nativeQuery = true
        @Query(value = "SELECT * FROM product1 WHERE supplier = ?1",nativeQuery = true)
        List<Product> getProductBySupplier(Integer id);


//        not work
        @Query(value = "SELECT * FROM product1 WHERE quantity < reorder_level",nativeQuery = true)
        List<Product> getProductToOrder();

}
