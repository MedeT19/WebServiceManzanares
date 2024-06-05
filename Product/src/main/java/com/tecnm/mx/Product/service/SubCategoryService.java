package com.tecnm.mx.Product.service;

import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;

import com.tecnm.mx.Product.dto.SubCategoryDto;
import com.tecnm.mx.Product.dto.SubCategoryResponse;


@Service
public interface SubCategoryService {
	public SubCategoryResponse create(SubCategoryDto subCategory);
	public SubCategoryResponse findOneById(UUID subId);
	public List<SubCategoryResponse> getAll();
}
