package com.tecnm.mx.Product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnm.mx.Product.entity.ProductModel;

@Repository
public interface ProductModelRepository extends JpaRepository<ProductModel, Integer>{
	ProductModel getByModelId(int modelId);
	
}