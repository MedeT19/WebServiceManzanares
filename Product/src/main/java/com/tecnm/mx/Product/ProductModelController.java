package com.tecnm.mx.Product;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecnm.mx.Product.dto.ProductModelDto;
import com.tecnm.mx.Product.dto.ProductModelResponse;
import com.tecnm.mx.Product.service.ProductModelService;

@RestController
@RequestMapping(path="/model")
public class ProductModelController {
	@Autowired
	ProductModelService productModelService;
	
	 @PostMapping("")
	 ProductModelResponse newModel(@RequestBody ProductModelDto newModel) {
		 return productModelService.create(newModel);
	 }
	 
	 @GetMapping("")
		public List<ProductModelResponse> getModel() {
			return productModelService.getAll();
		}
}
