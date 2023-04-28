package com.system.Bookshop.Service;

import com.system.Bookshop.Entity.SubCategory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubCategoryService {

    public SubCategory saveSubCategory(SubCategory subCategory);

    public List<SubCategory> getAllSubCategory();

    public abstract SubCategory getSubCategoryById(Integer id);

    public void deleteSubCategory(Integer id);

}
