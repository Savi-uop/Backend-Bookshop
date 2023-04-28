package com.system.Bookshop.Service;

import com.system.Bookshop.Entity.Category;
import com.system.Bookshop.Entity.Product;
import com.system.Bookshop.Repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepo categoryRepo;

    //create category
    @Override
    public Category saveCategory(Category category) {
            return categoryRepo.save(category);

    }

    @Override
    public List<Category> getAllCategories() {
         return categoryRepo.findAll();
    }


    @Override
    public Category getCategoryById(Integer id) {
//        Optional<Category> optional =categoryRepo.findById(id);
//        Category category =optional.get();
//        return category;
        return categoryRepo.findById(id).get();
    }

// update ekt wenma ekk oni na find kral save kram athi
//    @Override
//    public void updateCategory(int id) {
//        categoryRepo.save(category);
//    }

    @Override
    public void deleteCategory(Integer id) {
        categoryRepo.deleteById(id);
    }


//    @Override
//    public List<Product> getProductsByCategory(Integer id) {
//        return categoryRepo.getProductsByCategory(id);
//    }

}
