package com.tecnm.mx.Product.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecnm.mx.Product.entity.ProductModelProduct;
import com.tecnm.mx.Product.entity.ProductModelProductId;

public interface ProductModelProductRepository extends JpaRepository<ProductModelProduct, ProductModelProductId> {
    Optional<ProductModelProduct> findById(ProductModelProductId id);
}
