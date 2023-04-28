package com.system.Bookshop.Repository;

import com.system.Bookshop.Entity.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubCatRepo extends JpaRepository<SubCategory,Integer> {

    @Override
    Optional<SubCategory> findById(Integer integer);
}
