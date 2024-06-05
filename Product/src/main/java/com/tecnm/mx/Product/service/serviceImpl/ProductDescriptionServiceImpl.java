package com.tecnm.mx.Product.service.serviceImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tecnm.mx.Product.dto.ProductDescriptionDto;
import com.tecnm.mx.Product.dto.ProductDescriptionResponse;
import com.tecnm.mx.Product.entity.ProductDescription;
import com.tecnm.mx.Product.repository.ProductDescriptionRepository;
import com.tecnm.mx.Product.service.ProductDescriptionService;

@Component
public class ProductDescriptionServiceImpl implements ProductDescriptionService {

    @Autowired
    private ProductDescriptionRepository productDescriptionRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ProductDescriptionResponse create(ProductDescriptionDto descriptionDto) {
        ProductDescription descriptionEntity = modelMapper.map(descriptionDto, ProductDescription.class);
        ProductDescription newDescription = productDescriptionRepository.save(descriptionEntity);
        return modelMapper.map(newDescription, ProductDescriptionResponse.class);
    }

    @Override
    public ProductDescriptionResponse findOneById(UUID descId) {
        return null;
    }


    
    @Override
    public List<ProductDescriptionResponse> getAll() {
        List<ProductDescription> descriptions = productDescriptionRepository.findAll();
        List<ProductDescriptionResponse> descriptionResponses = new ArrayList<>();
        for (ProductDescription description : descriptions) {
            ProductDescriptionResponse descriptionResponse = modelMapper.map(description, ProductDescriptionResponse.class);
            descriptionResponses.add(descriptionResponse);
        }
        return descriptionResponses;
    }
}
