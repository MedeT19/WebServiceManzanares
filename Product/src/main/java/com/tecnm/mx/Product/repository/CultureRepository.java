package com.tecnm.mx.Product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tecnm.mx.Product.entity.Culture;

@Repository
public interface CultureRepository extends JpaRepository<Culture, String>{
	Culture getByCultureId(String cultureId);
    Culture getByName(String name);
}
