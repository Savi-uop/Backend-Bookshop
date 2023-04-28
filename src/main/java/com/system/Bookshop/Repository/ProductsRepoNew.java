package com.system.Bookshop.Repository;


import com.system.Bookshop.Entity.Product;
import com.system.Bookshop.Entity.ProductNew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepoNew extends JpaRepository<ProductNew,Integer> {

//    @Query(value = "SELECT * FROM PRODUCT WHERE ID= ?1",nativeQuery = true)
//    Product getProductById(Integer Id);



}
