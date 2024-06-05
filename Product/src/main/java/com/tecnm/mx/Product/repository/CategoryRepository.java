package com.tecnm.mx.Product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnm.mx.Product.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
	Category getByProductCategoryID(Integer productCategoryID);
	Category getByName(String name);
}
