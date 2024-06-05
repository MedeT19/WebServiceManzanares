package com.tecnm.mx.Product;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecnm.mx.Product.dto.ProductDescriptionDto;
import com.tecnm.mx.Product.dto.ProductDescriptionResponse;
import com.tecnm.mx.Product.service.ProductDescriptionService;

@RestController
@RequestMapping(path="/description")
public class ProductDescriptionController {
	@Autowired
	ProductDescriptionService productDescriptionService;
	
	 @PostMapping("")
	 ProductDescriptionResponse newIllustration(@RequestBody ProductDescriptionDto newDescription) {
		 return productDescriptionService.create(newDescription);
	 }
	 
	 @GetMapping("")
		public List<ProductDescriptionResponse> getDescId() {
			return productDescriptionService.getAll();
		}
}
