package com.tecnm.mx.Product.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tecnm.mx.Product.dto.ProductDto;
import com.tecnm.mx.Product.dto.ProductResponse;
import com.tecnm.mx.Product.entity.Product;
import com.tecnm.mx.Product.entity.ProductModel;
import com.tecnm.mx.Product.entity.SubCategory;
import com.tecnm.mx.Product.repository.ProductModelRepository;
import com.tecnm.mx.Product.repository.ProductRepository;
import com.tecnm.mx.Product.repository.SubCategoryRepository;
import com.tecnm.mx.Product.service.ProductService;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private SubCategoryRepository subcategoryRepository;

    @Autowired
    private ProductModelRepository productModelRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ProductResponse create(ProductDto productDto) throws Exception {
        try {
            Product product = modelMapper.map(productDto, Product.class);

            // Set subcategory if exists
            if (product.getSubCategory() != null) {
                Optional<SubCategory> subCategoryOpt = subcategoryRepository.findById(product.getSubCategory().getSubId());
                if (subCategoryOpt.isPresent()) {
                    product.setSubCategory(subCategoryOpt.get());
                } else {
                    throw new Exception("SubCategory not found");
                }
            }

            // Set product model if exists
            if (product.getModel() != null) {
                Optional<ProductModel> productModelOpt = productModelRepository.findById(product.getModel().getModelId());
                if (productModelOpt.isPresent()) {
                    product.setModel(productModelOpt.get());
                } else {
                    throw new Exception("ProductModel not found");
                }
            }

            System.out.println("Creating: " + product.toString());
            Product newProduct = productRepository.save(product);
            return modelMapper.map(newProduct, ProductResponse.class);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public ProductResponse findOneById(int id) {
        return modelMapper.map(productRepository.findOneById(id), ProductResponse.class);
    }

    @Override
    public ProductResponse findOneByName(String name) {
        return modelMapper.map(productRepository.findOneByName(name), ProductResponse.class);
    }

    @Override
    public ProductResponse save(ProductDto newProduct) {
        Product product = modelMapper.map(newProduct, Product.class);
        return modelMapper.map(productRepository.save(product), ProductResponse.class);
    }

    @Override
    public List<ProductResponse> getAll() {
        List<Product> products = productRepository.findAll();
        List<ProductResponse> productDtosResponse = new ArrayList<>();
        for (Product product : products) {
            ProductResponse productDtoResponse = modelMapper.map(product, ProductResponse.class);
            productDtosResponse.add(productDtoResponse);
        }
        return productDtosResponse;
    }
    @Override
    public ProductResponse update(ProductResponse productDto) {
        try {
            Product product = modelMapper.map(productDto, Product.class);
    
            // Set subcategory if exists
            if (product.getSubCategory() != null) {
                Optional<SubCategory> subCategoryOpt = subcategoryRepository.findById(product.getSubCategory().getSubId());
                if (subCategoryOpt.isPresent()) {
                    product.setSubCategory(subCategoryOpt.get());
                } else {
                    throw new RuntimeException("SubCategory not found");
                }
            }
    
            // Set product model if exists
            if (product.getModel() != null) {
                Optional<ProductModel> productModelOpt = productModelRepository.findById(product.getModel().getModelId());
                if (productModelOpt.isPresent()) {
                    product.setModel(productModelOpt.get());
                } else {
                    throw new RuntimeException("ProductModel not found");
                }
            }
    
            System.out.println("Updating: " + product.toString());
            Product newProduct = productRepository.save(product);
            return modelMapper.map(newProduct, ProductResponse.class);
        } catch (Exception e) {
            throw new RuntimeException("Error updating product: " + e.getMessage(), e);
        }
    }
    

}
