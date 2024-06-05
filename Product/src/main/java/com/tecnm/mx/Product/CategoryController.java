package com.tecnm.mx.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecnm.mx.Product.dto.CategoryDto;
import com.tecnm.mx.Product.dto.CategoryResponse;
import com.tecnm.mx.Product.service.CategoryService;

@RestController
@RequestMapping(path="/categories")
public class CategoryController {
	@Autowired
	CategoryService categoryService;
	
	 @PostMapping("")
	 CategoryResponse newCategory(@RequestBody CategoryDto newCategory) {
		 return categoryService.create(newCategory);
	 }
	 
	 @GetMapping("")
		public List<CategoryResponse> getCategory() {
			return categoryService.getAll();
		}
}
