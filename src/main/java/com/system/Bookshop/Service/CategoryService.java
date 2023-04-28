package com.system.Bookshop.Service;

import com.system.Bookshop.Entity.Category;
import com.system.Bookshop.Entity.Product;
import com.system.Bookshop.Repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {



//    private CategoryRepo categoryRepo;

    //add category and save in db
    public Category saveCategory(Category category);

    public List<Category> getAllCategories();

    public abstract Category getCategoryById(Integer id);

//    public void updateCategory(int id);
//
    public void deleteCategory(Integer id);

//    public List<Product> getProductsByCategory(Integer id);


}
