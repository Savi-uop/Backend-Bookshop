package com.system.Bookshop.Service;


import com.system.Bookshop.Entity.Product;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("product1")

public interface ProductService {

//    private ProductRepo productRepo;


    public Product saveProduct(Product product);

    public List<Product> getAllProducts();

    public abstract Product getProductById(Integer id);

    public void deleteProduct(Integer id);

//    public Product getProductByCategory(Integer cat_id);

//      public Product getProductByCategory(Integer id,Integer category);

//    public Product getProductByCategory(Integer id);

        public List<Product> getProductBySupplier(Integer id);

//        public  List<Product> getProductToOrder();
}
