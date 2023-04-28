package com.system.Bookshop.Service;

import com.system.Bookshop.DTO.ProductDto;
import com.system.Bookshop.Entity.Product;
import com.system.Bookshop.Entity.ProductNew;
import com.system.Bookshop.Repository.ProductsRepoNew;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ProductsServiceNew {

    @Autowired
    private ProductsRepoNew productsRepoNew;

    @Autowired
    private ModelMapper modelMapper;

    public ProductDto saveProduct(ProductDto productDto){
//        ProductNew p = modelMapper.map(productDto,Product.class);
        productsRepoNew.save(modelMapper.map(productDto, ProductNew.class));
        return productDto;
    }

//    public List<ProductNew> getAllProducts(){
//        List<ProductNew> productList = productsRepoNew.findAll();
//        return  modelMapper.map(productList,new TypeToken<List<ProductDto>>(){}.getType());
//    }


    
}
