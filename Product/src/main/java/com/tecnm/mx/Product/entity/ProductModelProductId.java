package com.tecnm.mx.Product.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ProductModelProductId implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "productmodelid")
    private ProductModel modelId;

    @ManyToOne
    @JoinColumn(name = "productdescriptionid    ")
    private ProductDescription descId;

    @ManyToOne
    @JoinColumn(name = "cultureid")
    private Culture cultureId;

    // Constructor vacío
    public ProductModelProductId() {

    }

    // Constructor con parámetros
    public ProductModelProductId(ProductModel modelId, ProductDescription descId, Culture cultureId) {
        this.modelId = modelId;
        this.descId = descId;
        this.cultureId = cultureId;
    }

    // Getters y setters
    public ProductModel getModelId() {
        return modelId;
    }

    public void setModelId(ProductModel modelId) {
        this.modelId = modelId;
    }

    public ProductDescription getDescId() {
        return descId;
    }

    public void setDescId(ProductDescription descId) {
        this.descId = descId;
    }

    public Culture getCultureId() {
        return cultureId;
    }

    public void setCultureId(Culture cultureId) {
        this.cultureId = cultureId;
    }
}
