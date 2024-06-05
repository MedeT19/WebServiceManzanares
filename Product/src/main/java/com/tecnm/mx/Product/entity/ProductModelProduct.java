package com.tecnm.mx.Product.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(schema = "Production", name = "productmodelproductdescriptionculture")
public class ProductModelProduct implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private ProductModelProductId id;
@Column(name="modifieddate")
    private String modifiedDate;

    // Constructor vacío
    public ProductModelProduct() {}

    // Constructor con parámetros
    public ProductModelProduct(ProductModelProductId id, String modifiedDate) {
        this.id = id;
        this.modifiedDate = modifiedDate;
    }

    public ProductModelProductId getId() {
        return id;
    }

    public void setId(ProductModelProductId id) {
        this.id = id;
    }

	
    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
