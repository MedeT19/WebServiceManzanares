package com.tecnm.mx.Product.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tecnm.mx.Product.dto.ProductModelProductDto;
import com.tecnm.mx.Product.dto.ProductModelProductResponse;
import com.tecnm.mx.Product.entity.Culture;
import com.tecnm.mx.Product.entity.ProductDescription;
import com.tecnm.mx.Product.entity.ProductModel;
import com.tecnm.mx.Product.entity.ProductModelProduct;
import com.tecnm.mx.Product.entity.ProductModelProductId;
import com.tecnm.mx.Product.repository.CultureRepository;
import com.tecnm.mx.Product.repository.ProductDescriptionRepository;
import com.tecnm.mx.Product.repository.ProductModelProductRepository;
import com.tecnm.mx.Product.repository.ProductModelRepository;
import com.tecnm.mx.Product.service.ProductModelProductService;

@Component
public class ProductModelProductServiceImpl implements ProductModelProductService {

    @Autowired
    private ProductModelProductRepository productModelProductRepository;

    @Autowired
    private CultureRepository cultureRepository;

    @Autowired
    private ProductDescriptionRepository productDescriptionRepository;

    @Autowired
    private ProductModelRepository productModelRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ProductModelProductResponse create(ProductModelProductDto productModelProductDto) throws Exception {
        try {
            ProductModelProduct productModelProduct = modelMapper.map(productModelProductDto, ProductModelProduct.class);

            // Set culture, product description, and product model if exists
            setCultureAndDescriptionAndModel(productModelProductDto, productModelProduct);

            System.out.println("Creating: " + productModelProduct.toString());
            ProductModelProduct newProductModelProduct = productModelProductRepository.save(productModelProduct);
            return modelMapper.map(newProductModelProduct, ProductModelProductResponse.class);
        } catch (Exception e) {
            throw new Exception("Error creating product model product", e);
        }
    }

    @Override
    public ProductModelProductResponse findOneById(int modelId, int descId, String cultureId) throws Exception {
        try {
            // Crear instancias de ProductModel, ProductDescription y Culture
            ProductModel productModel = productModelRepository.findById(modelId)
                    .orElseThrow(() -> new Exception("ProductModel not found"));
            ProductDescription productDescription = productDescriptionRepository.findById(descId)
                    .orElseThrow(() -> new Exception("ProductDescription not found"));
            Culture culture = cultureRepository.findById(cultureId)
                    .orElseThrow(() -> new Exception("Culture not found"));

            // Crear una instancia de ProductModelProductId
            ProductModelProductId productId = new ProductModelProductId(productModel, productDescription, culture);

            // Buscar el producto por su id compuesto
            Optional<ProductModelProduct> result = productModelProductRepository.findById(productId);

            if (result.isPresent()) {
                return modelMapper.map(result.get(), ProductModelProductResponse.class);
            } else {
                throw new Exception("Product not found");
            }
        } catch (Exception e) {
            throw new Exception("Error finding product model product", e);
        }
    }

    @Override
    public ProductModelProductResponse save(ProductModelProductDto newProduct) {
        ProductModelProduct product = modelMapper.map(newProduct, ProductModelProduct.class);
        return modelMapper.map(productModelProductRepository.save(product), ProductModelProductResponse.class);
    }

    @Override
    public List<ProductModelProductResponse> getAll() {
        List<ProductModelProduct> products = productModelProductRepository.findAll();
        List<ProductModelProductResponse> productDtosResponse = new ArrayList<>();
        for (ProductModelProduct product : products) {
            try {
                ProductModelProductResponse productDtoResponse = modelMapper.map(product, ProductModelProductResponse.class);
                productDtosResponse.add(productDtoResponse);
            } catch (NumberFormatException e) {
                System.err.println("Error converting product: " + e.getMessage());
                // Aquí puedes manejar el error según sea necesario
            }
        }
        return productDtosResponse;
    }

    @Override
    public ProductModelProductResponse update(ProductModelProductDto productDto) {
        try {
            ProductModelProduct product = modelMapper.map(productDto, ProductModelProduct.class);

            // Set culture, product description, and product model if exists
            setCultureAndDescriptionAndModel(productDto, product);

            System.out.println("Updating: " + product.toString());
            ProductModelProduct newProduct = productModelProductRepository.save(product);
            return modelMapper.map(newProduct, ProductModelProductResponse.class);
        } catch (Exception e) {
            throw new RuntimeException("Error updating product model product", e);
        }
    }

    // Método para establecer cultura, descripción de producto y modelo de producto si existen
    private void setCultureAndDescriptionAndModel(ProductModelProductDto dto, ProductModelProduct entity)
            throws Exception {
        // Establecer cultura
        if (dto.getCultureID() != null) {
            Optional<Culture> cultureOpt = cultureRepository.findById(dto.getCultureID().getCultureId());
            if (cultureOpt.isPresent()) {
                entity.getId().setCultureId(cultureOpt.get());
            } else {
                throw new Exception("Culture not found");
            }
        }

        // Establecer descripción de producto
        if (dto.getDesc() != null) {
            Optional<ProductDescription> productDescriptionOpt = productDescriptionRepository
                    .findById(dto.getDesc().getDescId());
            if (productDescriptionOpt.isPresent()) {
                entity.getId().setDescId(productDescriptionOpt.get());
            } else {
                throw new Exception("ProductDescription not found");
            }
        }

        // Establecer modelo de producto
        if (dto.getModel() != null) {
            Optional<ProductModel> productModelOpt = productModelRepository.findById(dto.getModel().getModelId());
            if (productModelOpt.isPresent()) {
                entity.getId().setModelId(productModelOpt.get());
            } else {
                throw new Exception("ProductModel not found");
            }
        }
    }
}
