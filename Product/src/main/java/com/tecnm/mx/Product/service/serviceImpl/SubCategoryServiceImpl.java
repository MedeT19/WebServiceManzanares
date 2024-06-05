package com.tecnm.mx.Product.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tecnm.mx.Product.dto.SubCategoryDto;
import com.tecnm.mx.Product.dto.SubCategoryResponse;
import com.tecnm.mx.Product.entity.SubCategory;
import com.tecnm.mx.Product.repository.SubCategoryRepository;
import com.tecnm.mx.Product.service.SubCategoryService;

@Component
public class SubCategoryServiceImpl implements SubCategoryService {

    @Autowired
    private SubCategoryRepository subCategoryRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public SubCategoryResponse create(SubCategoryDto subCategoryDto) {
        SubCategory subCategoryEntity = modelMapper.map(subCategoryDto, SubCategory.class);
        SubCategory newSubCategory = subCategoryRepository.save(subCategoryEntity);
        return modelMapper.map(newSubCategory, SubCategoryResponse.class);
    }
    
    @Override
    public SubCategoryResponse findOneById(UUID subId) {
        return null;
    }

    @Override
    public List<SubCategoryResponse> getAll() {
        List<SubCategory> subCategories = subCategoryRepository.findAll();
        List<SubCategoryResponse> subCategoryResponses = new ArrayList<>();
        for (SubCategory subCategory : subCategories) {
            SubCategoryResponse subCategoryResponse = modelMapper.map(subCategory, SubCategoryResponse.class);
            subCategoryResponses.add(subCategoryResponse);
        }
        return subCategoryResponses;
    }
}

