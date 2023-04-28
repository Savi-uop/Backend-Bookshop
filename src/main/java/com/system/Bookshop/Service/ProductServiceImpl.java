package com.system.Bookshop.Service;

import com.system.Bookshop.Entity.Product;
import com.system.Bookshop.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepo.findById(id).get();
    }

    @Override
    public void deleteProduct(Integer id) {
       productRepo.deleteById(id);
    }


//    @Override
//    public Product getProductByCategory(Integer cat_id) {
//        return productRepo.getProductByCategory(cat_id);
//    }

//
//    @Override
//    public Product getProductByCategory(Integer id , Integer category) {
//        return productRepo.getProductByCategory(id,category);
//    }

//    @Override
//    public Product getProductByCategory(Integer id) {
//        return productRepo.getProductByCategory(id);
//    }


    @Override
    public List<Product> getProductBySupplier(Integer id) {
        return productRepo.getProductBySupplier(id);
    }

//    @Override
//    public List<Product> getProductToOrder() {
//        return productRepo.getProductToOrder();
//    }

}
