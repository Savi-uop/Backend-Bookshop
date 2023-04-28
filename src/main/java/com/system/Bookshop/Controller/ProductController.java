package com.system.Bookshop.Controller;

import com.system.Bookshop.DTO.ProductDto;
import com.system.Bookshop.Entity.Category;
import com.system.Bookshop.Entity.Product;
import com.system.Bookshop.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping(value = "api/v1/products")
@CrossOrigin("http://localhost:3000")

public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/getProducts")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();

    }

    @PostMapping("/saveProducts")
    public String saveProducts(@RequestBody Product product){
        productService.saveProduct(product);
        return "new product is added" ;
    }

    // with image save product
//    @PostMapping("/saveProducts")
//    public RedirectView saveProducts(@ModelAttribute("product") Product product, @RequestParam("image")MultipartFile multipartFile) throws IOException {
//       String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
//       product.setImage1(fileName);
//        Product saveProduct = productService.saveProduct(product);
//        String uploadDir = "product_photos" + saveProduct.getId();
//        FileUploadUtil.saveFile(uploadDir,fileName,multipartFile);
////        return "new product is added" ;
//    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Integer id){
        try{
            Product product = productService.getProductById(id);
            return new ResponseEntity<Product>(product, HttpStatus.OK);
        }catch(NoSuchElementException e) {
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product,@PathVariable Integer id){
        try{
            Product existingProduct = productService.getProductById(id);
            productService.saveProduct(product);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (NoSuchElementException e){
            return  new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleting/{id}")
    public String deleteProduct(@PathVariable Integer id){
        productService.deleteProduct(id);
        return "Deleted product with ID :" + id + " successfully!";
    }

    // get products by their category

//    @GetMapping("/getProductsByCats/{cat_id}")
//    public ResponseEntity<Product> getProductsByCats(@PathVariable Integer cat_id){
//            // return productService.getProductByCategory(id);
//
//        try{
//            Product product = productService.getProductByCategory(cat_id);
//            return new ResponseEntity<Product>(product, HttpStatus.OK);
//        }catch(NoSuchElementException e) {
//            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
//        }
//
//    }
//
//    @GetMapping("/getProductsByCats/{id}/{category}")
//    public Product getProductsByCategory(@PathVariable Integer id,Integer category){
//        return productService.getProductByCategory(id,category);
//    }


//    @GetMapping("/getProductsByCats/{id}")
//    public Product getProductsByCategory(@PathVariable Integer id){
//        return productService.getProductByCategory(id);
//    }


    //meke id ek string
//    @GetMapping("/getProductsBySupplier/{id}")
//    public Product getProductsBySupplier(@PathVariable String id){
//        return productService.getProductBySupplier(id);
//    }

    @GetMapping("/getProductsBySupplier/{id}")
    public ResponseEntity<List<Product>> getProductsBySupplier(@PathVariable Integer id){

//            Product p = productService.getProductBySupplier(id);
            return new ResponseEntity<>(productService.getProductBySupplier(id),HttpStatus.OK);

    }



//    @GetMapping("/getProductsToOrder")
//    public List<Product> getProductsToOrder(){
//        return productService.getProductToOrder();
//
//    }



}
