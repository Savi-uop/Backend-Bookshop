package com.system.Bookshop.Service;

import com.system.Bookshop.Entity.SubCategory;
import com.system.Bookshop.Repository.CategoryRepo;
import com.system.Bookshop.Repository.SubCatRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SubCategoryServiceImpl implements SubCategoryService{

    @Autowired
    private SubCatRepo subCatRepo;
//    private final SubCatRepo subCatRepo;
//    private final CategoryRepo categoryRepo;

    @Override
    public SubCategory saveSubCategory(SubCategory subCategory) {
        return subCatRepo.save(subCategory);
    }

//    @Override
//    public SubCategory saveSubCategory(SubCategory subCategory) {
//        SubCategory subCategory1 = new SubCategory();
//        BeanUtils.copyProperties(subCategory,subCategory1);
//
//        subCategory1.setCategory(categoryRepo.getById(subCategory.getCategory().getId()));
////                .getById(subCategory.getCategory().getId()));
////        getReferenceById(subCategory.getCategory().getId()))
//        SubCategory subCategory2 = subCatRepo.save(subCategory1);
//        System.out.println(subCategory2);
//        return subCategory;

//        return subCatRepo.save(subCategory);
//    }


    @Override
    public List<SubCategory> getAllSubCategory() {
        return subCatRepo.findAll();
    }

    @Override
    public SubCategory getSubCategoryById(Integer id) {
        return subCatRepo.findById(id).get();
    }

    @Override
    public void deleteSubCategory(Integer id) {
        subCatRepo.deleteById(id);
    }
}
