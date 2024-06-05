package com.tecnm.mx.Product.service;

import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;

import com.tecnm.mx.Product.dto.ProductDescriptionDto;
import com.tecnm.mx.Product.dto.ProductDescriptionResponse;


@Service
public interface ProductDescriptionService {
	public ProductDescriptionResponse create(ProductDescriptionDto description);
	public ProductDescriptionResponse findOneById(UUID descId);
	public List<ProductDescriptionResponse> getAll();
}
