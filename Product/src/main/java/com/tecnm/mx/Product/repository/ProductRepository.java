package com.tecnm.mx.Product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnm.mx.Product.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	public Product findOneById(int id);
	public Product findOneByName(String name);
}
