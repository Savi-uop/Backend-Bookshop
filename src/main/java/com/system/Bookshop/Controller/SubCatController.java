package com.system.Bookshop.Controller;

import com.system.Bookshop.Entity.SubCategory;
import com.system.Bookshop.Service.CategoryService;
import com.system.Bookshop.Service.SubCategoryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("api/v1/subcategory")
@CrossOrigin("http://localhost:3000")
@AllArgsConstructor
public class SubCatController {

    @Autowired
//    private SubCategoryService subCategoryService;

    private final SubCategoryService subCategoryService;
    private final CategoryService categoryService;


    @GetMapping("/getSubCats")
    public List<SubCategory> getSubCategories(){
        return subCategoryService.getAllSubCategory();
    }

    @PostMapping("/saveSubCategory")
    public String saveSubCategory(@RequestBody SubCategory subCategory){
        subCategoryService.saveSubCategory(subCategory);
        return "new sub-category is added" ;
    }


//    @PostMapping("/saveSub")
//    public SubCategory saveSubCategory(@RequestBody SubCategory subCategory){
//        return subCategoryService.saveSubCategory(subCategory);
//    }

    @GetMapping("/{id}")
    public ResponseEntity<SubCategory> getSubCategory(@PathVariable Integer id){
        try{
            SubCategory subCategory = subCategoryService.getSubCategoryById(id);
            return new ResponseEntity<SubCategory>(subCategory, HttpStatus.OK);
        }
            catch(NoSuchElementException e) {
            return new ResponseEntity<SubCategory>(HttpStatus.OK);
            }
        }

        @PutMapping("update/{id}")
        public ResponseEntity<SubCategory> updateSubCategory(@RequestBody SubCategory subCategory,@PathVariable Integer id){
            try{
                SubCategory existingSubCategory = subCategoryService.getSubCategoryById(id);
                subCategoryService.saveSubCategory(subCategory);
                return new ResponseEntity<>(HttpStatus.OK);
            }catch (NoSuchElementException e){
                return  new ResponseEntity<SubCategory>(HttpStatus.NOT_FOUND);
            }
        }

        @DeleteMapping("/deleting/{id}")
        public String deleteSubCategory(@PathVariable Integer id){
            subCategoryService.deleteSubCategory(id);
            return "Deleted Sub-category with ID :" + id + "successfully!";
        }





}
