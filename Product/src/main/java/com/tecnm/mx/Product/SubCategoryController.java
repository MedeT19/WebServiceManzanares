package com.tecnm.mx.Product;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecnm.mx.Product.dto.SubCategoryDto;
import com.tecnm.mx.Product.dto.SubCategoryResponse;
import com.tecnm.mx.Product.service.SubCategoryService;

@RestController
@RequestMapping(path="/subcategory")
public class SubCategoryController {
	@Autowired
	SubCategoryService subCategoryService;
	
	 @PostMapping("")
	 SubCategoryResponse newSubCategory(@RequestBody SubCategoryDto newSubCategory) {
		 return subCategoryService.create(newSubCategory);
	 }
	 
	 @GetMapping("")
		public List<SubCategoryResponse> getSubCategory() {
			return subCategoryService.getAll();
		}
}
