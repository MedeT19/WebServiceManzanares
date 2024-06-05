package com.tecnm.mx.Product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tecnm.mx.Product.dto.ProductDto;
import com.tecnm.mx.Product.dto.ProductResponse;


@Service
public interface ProductService {
	public ProductResponse create(ProductDto product) throws Exception;
	public ProductResponse findOneById(int id);
	public ProductResponse findOneByName(String name);
	public ProductResponse save(ProductDto newProduct);
	public List<ProductResponse> getAll();
	public ProductResponse update(ProductResponse newProduct);
}
