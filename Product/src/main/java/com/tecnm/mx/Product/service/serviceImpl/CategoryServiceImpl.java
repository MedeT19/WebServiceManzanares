package com.tecnm.mx.Product.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tecnm.mx.Product.dto.CategoryDto;
import com.tecnm.mx.Product.dto.CategoryResponse;
import com.tecnm.mx.Product.entity.Category;
import com.tecnm.mx.Product.repository.CategoryRepository;
import com.tecnm.mx.Product.service.CategoryService;

@Component
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CategoryResponse create(CategoryDto categoryDto) {
        Category categoryEntity = modelMapper.map(categoryDto, Category.class);
        Category newCategory = categoryRepository.save(categoryEntity);
        return modelMapper.map(newCategory, CategoryResponse.class);
    }

    @Override
    public CategoryResponse findOneById(UUID productCategoryID) {

        return null;
    }

    @Override
    public List<CategoryResponse> getAll() {
        List<Category> categories = categoryRepository.findAll();
        List<CategoryResponse> categoryResponses = new ArrayList<>();
        for (Category category : categories) {
            CategoryResponse categoryResponse = modelMapper.map(category, CategoryResponse.class);
            categoryResponses.add(categoryResponse);
        }
        return categoryResponses;
    }
}
