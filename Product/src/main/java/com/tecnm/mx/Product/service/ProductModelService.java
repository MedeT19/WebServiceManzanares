package com.tecnm.mx.Product.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.tecnm.mx.Product.dto.ProductModelDto;
import com.tecnm.mx.Product.dto.ProductModelResponse;


@Service
public interface ProductModelService {
	public ProductModelResponse create(ProductModelDto productModel);
	public ProductModelResponse findOneById(UUID modelId);
	public List<ProductModelResponse> getAll();
}
