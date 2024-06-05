package com.tecnm.mx.Product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnm.mx.Product.entity.ProductModelIlustration;

@Repository
public interface ProductModelIlustrationRepository extends JpaRepository<ProductModelIlustration, Integer>{
	ProductModelIlustrationRepository getByProductModelId(Integer productModelId);
}
