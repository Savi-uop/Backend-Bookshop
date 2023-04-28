package com.system.Bookshop.Controller;

import com.system.Bookshop.Entity.Category;
import com.system.Bookshop.Entity.Product;
import com.system.Bookshop.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(value = "api/v1/category")
@CrossOrigin("http://localhost:3000")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/saveCat")
    public String saveCategory(@RequestBody Category category){
        categoryService.saveCategory(category);
        return "new category is added" ;
    }

    @GetMapping("/getCategories")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategory(@PathVariable Integer id){
        try{
            Category category = categoryService.getCategoryById(id);
            return new ResponseEntity<Category>(category,HttpStatus.OK);
        }catch(NoSuchElementException e) {
            return new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
        }

    }

    @PutMapping("update/{id}")
    public ResponseEntity<Category> updateCategory(@RequestBody Category category,@PathVariable Integer id){
        try{
            Category existingCategory = categoryService.getCategoryById(id);
            categoryService.saveCategory(category);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (NoSuchElementException e){
            return  new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleting/{id}")
    public String deleteCategory(@PathVariable Integer id){
        categoryService.deleteCategory(id);
        return "Deleted category with ID :" + id + "successfully!";
    }

    //this is not working
//    @GetMapping("/{id}/products")
//    public List<Product> getProductsByCategory(@PathVariable("id") Integer id){
//        return categoryService.getProductsByCategory(id);
//    }


}
