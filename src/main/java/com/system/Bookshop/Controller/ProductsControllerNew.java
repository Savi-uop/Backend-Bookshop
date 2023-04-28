package com.system.Bookshop.Controller;

import com.system.Bookshop.DTO.ProductDto;
import com.system.Bookshop.Entity.ProductNew;
import com.system.Bookshop.Repository.ProductsRepoNew;
import com.system.Bookshop.Service.ProductsServiceNew;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/product")
@CrossOrigin("http://localhost:3000")

@AllArgsConstructor
public class ProductsControllerNew {

    @Autowired
    private ProductsServiceNew productsServiceNew;

    @Autowired
    private ProductsRepoNew productsRepoNew;


    @PostMapping("/saveProduct1")
    public ProductDto saveProduct(@RequestBody ProductDto productDto)
    {
        return productsServiceNew.saveProduct(productDto);
    }

//    @GetMapping("/getProducts1")
//    public List<ProductNew> getAllProducts(){
//        return productsServiceNew.getAllProducts();
//    }

}
