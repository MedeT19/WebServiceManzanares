package com.tecnm.mx.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecnm.mx.Product.dto.ProductModelProductDto;
import com.tecnm.mx.Product.dto.ProductModelProductResponse;
import com.tecnm.mx.Product.service.ProductModelProductService;

@RestController
@RequestMapping("/pmp")
public class ProductModelProductController {

    @Autowired
    private ProductModelProductService productModelProductService;

    @PostMapping("")
    public ProductModelProductResponse createProductModelProduct(@RequestBody ProductModelProductDto productModelProductDto) {
        try {
            return productModelProductService.create(productModelProductDto);
        } catch (Exception e) {
            throw new RuntimeException("Error creating product model product", e);
        }
    }

    @GetMapping("/{modelId}/{descId}/{cultureId}")
    public ProductModelProductResponse getProductModelProduct(@PathVariable int modelId, @PathVariable int descId, @PathVariable String cultureId) {
        try {
            return productModelProductService.findOneById(modelId, descId, cultureId);
        } catch (Exception e) {
            throw new RuntimeException("Error getting product model product", e);
        }
    }

    @PutMapping("")
    public ProductModelProductResponse updateProductModelProduct(@RequestBody ProductModelProductDto productModelProductDto) {
        try {
            return productModelProductService.update(productModelProductDto);
        } catch (Exception e) {
            throw new RuntimeException("Error updating product model product", e);
        }
    }

    @GetMapping("")
    public List<ProductModelProductResponse> getAllProductModelProducts() {
        return productModelProductService.getAll();
    }
}
