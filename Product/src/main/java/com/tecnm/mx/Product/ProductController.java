package com.tecnm.mx.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.tecnm.mx.Product.dto.ProductDto;
import com.tecnm.mx.Product.dto.ProductResponse;
import com.tecnm.mx.Product.service.ProductService;

@RestController
@RequestMapping(path="/products")
public class ProductController {
	@Autowired
	ProductService productService;
	
	 @PostMapping("")
	 ProductResponse newProduct(@RequestBody ProductDto newProduct) {
		 System.out.println(newProduct.toString());
		 try {
			 return productService.create(newProduct);
		 }catch(Exception e) {
			 throw new ResponseStatusException(
			          HttpStatus.BAD_REQUEST, "No pudo crearse el producto debido a información incorrecta", e);
		 }
	 }
	 
	 @PutMapping("")
	 ProductResponse updateProduct(@RequestBody ProductResponse newProduct) {
		 System.out.println(newProduct.toString());
		 try {
			 return productService.update(newProduct);
		 }catch(Exception e) {
			 throw new ResponseStatusException(
			          HttpStatus.BAD_REQUEST, "No pudo crearse el producto debido a información incorrecta", e);
		 }
	 }
	 
	 @GetMapping("")
		public List<ProductResponse> getProduct() {
			return productService.getAll();
		}
	
	 @GetMapping("/productName")
		public ProductResponse getProduct(@RequestParam String name) {
			return productService.findOneByName(name);
		}
}
