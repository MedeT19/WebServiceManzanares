package com.tecnm.mx.Product.service;

import java.util.List;

import com.tecnm.mx.Product.dto.ProductModelProductDto;
import com.tecnm.mx.Product.dto.ProductModelProductResponse;

public interface ProductModelProductService {
    ProductModelProductResponse create(ProductModelProductDto productModelProductDto) throws Exception;
    ProductModelProductResponse findOneById(int modelId, int descId, String cultureId) throws Exception;
    ProductModelProductResponse save(ProductModelProductDto newProduct);
    List<ProductModelProductResponse> getAll();
    ProductModelProductResponse update(ProductModelProductDto productDto);
}
