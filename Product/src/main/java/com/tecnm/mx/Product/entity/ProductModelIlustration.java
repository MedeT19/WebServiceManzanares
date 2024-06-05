package com.tecnm.mx.Product.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema="Production",name="Productmodelillustration")
public class ProductModelIlustration implements Serializable {

	private static final long serialVersionUID = 1L;

@Id
@Column(name="productmodelid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productModelId;
	
	
	@Column
	private String name;

	
	public int getProductModelId() {
		return productModelId;
	}

	public void setProductModelId(int productModelId) {
		this.productModelId = productModelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public ProductModelIlustration(int productModelId, String name) {
		super();
		this.productModelId = productModelId;
		this.name = name;
	
	}

	public ProductModelIlustration() {
		super();
		this.productModelId= 0;
		this.name = "";
	
	}

	@Override
	public String toString() {
		return "ProductModelIllustration [id=" + productModelId + ", name=" + name + "]";
	}
	
	
}
