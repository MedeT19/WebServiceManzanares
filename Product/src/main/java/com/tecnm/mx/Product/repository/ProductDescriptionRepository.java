package com.tecnm.mx.Product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnm.mx.Product.entity.ProductDescription;

@Repository
public interface ProductDescriptionRepository extends JpaRepository<ProductDescription, Integer> {
    ProductDescription getByDescId(Integer descId);
}
