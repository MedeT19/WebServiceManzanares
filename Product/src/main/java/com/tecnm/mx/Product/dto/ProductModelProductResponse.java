package com.tecnm.mx.Product.dto;

import java.io.Serializable;

public class ProductModelProductResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private ProductModelResponse modelId;
    private ProductDescriptionResponse descId;
    private CultureResponse cultureId;
    private String registDate;

    public ProductModelProductResponse() {
        // Constructor sin parámetros
    }

    public ProductModelResponse getModelId() {
        return modelId;
    }

    public void setModelId(ProductModelResponse modelId) {
        this.modelId = modelId;
    }

    public ProductDescriptionResponse getDescId() {
        return descId;
    }

    public void setDescId(ProductDescriptionResponse descId) {
        this.descId = descId;
    }

    public CultureResponse getCultureId() {
        return cultureId;
    }

    public void setCultureId(CultureResponse cultureId) {
        this.cultureId = cultureId;
    }

    public String getRegistDate() {
        return registDate;
    }

    public void setRegistDate(String registDate) {
        this.registDate = registDate;
    }

    @Override
    public String toString() {
        return "ProductModelProductResponse [modelId=" + modelId + ", descId=" + descId 
               + ", cultureId=" + cultureId + ", registDate=" + registDate + "]";
    }
}
