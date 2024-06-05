package com.tecnm.mx.Product.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.tecnm.mx.Product.dto.CategoryDto;
import com.tecnm.mx.Product.dto.CategoryResponse;


@Service
public interface CategoryService {
	public CategoryResponse create(CategoryDto category);
	public CategoryResponse findOneById(UUID productCategoryID);
	public List<CategoryResponse> getAll();
}
