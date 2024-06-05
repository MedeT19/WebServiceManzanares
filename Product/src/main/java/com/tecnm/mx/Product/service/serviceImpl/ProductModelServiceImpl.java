package com.tecnm.mx.Product.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.tecnm.mx.Product.dto.ProductModelDto;
import com.tecnm.mx.Product.dto.ProductModelResponse;
import com.tecnm.mx.Product.entity.ProductModel;
import com.tecnm.mx.Product.repository.ProductModelRepository;
import com.tecnm.mx.Product.service.ProductModelService;

@Component
public class ProductModelServiceImpl implements ProductModelService {

    @Autowired
    private ProductModelRepository productModelRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ProductModelResponse create(ProductModelDto productModelDto) {
        ProductModel productModelEntity = modelMapper.map(productModelDto, ProductModel.class);
        ProductModel newProductModel = productModelRepository.save(productModelEntity);
        return modelMapper.map(newProductModel, ProductModelResponse.class);
    }

    @Override
    public ProductModelResponse findOneById(UUID modelId) {
        return null;
    }

    @Override
    public List<ProductModelResponse> getAll() {
        List<ProductModel> productModels = productModelRepository.findAll();
        List<ProductModelResponse> productModelResponses = new ArrayList<>();
        for (ProductModel productModel : productModels) {
            ProductModelResponse productModelResponse = modelMapper.map(productModel, ProductModelResponse.class);
            productModelResponses.add(productModelResponse);
        }
        return productModelResponses;
    }
}
