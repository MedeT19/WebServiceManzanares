package com.tecnm.mx.Product.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema="Production",name="Productmodel")
public class ProductModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="productmodelID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int modelId;
	
	@Column
	private String name;

	public int getModelId() {
		return modelId;
	}

	public void setModelId(int modelId) {
		this.modelId = modelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public ProductModel(int modelId, String name) {
		super();
		this.modelId = modelId;
		this.name = name;
	
	}

	public ProductModel() {
		super();
		this.modelId =0;
		this.name = "";
	
	}

	@Override
	public String toString() {
		return "ProductModel [id=" + modelId + ", name=" + name + "]";
	}
	
}
