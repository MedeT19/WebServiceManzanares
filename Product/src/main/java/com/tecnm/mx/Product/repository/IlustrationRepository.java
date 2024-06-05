package com.tecnm.mx.Product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnm.mx.Product.entity.Illustration;

@Repository
public interface IlustrationRepository extends JpaRepository<Illustration, Integer>{
	Illustration getById(Integer id);
}