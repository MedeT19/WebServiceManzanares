package com.tecnm.mx.Product.dto;

import java.io.Serializable;

public class ProductModelResponse extends ProductModelDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int modelId;

	public ProductModelResponse(int modelId) {
		super();
		this.modelId = modelId;
	}

	public ProductModelResponse() {
		super();
	}

	public int getModelId() {
		return modelId;
	}

	public void setModelId(int modelId) {
		this.modelId = modelId;
	}

	@Override
	public String toString() {
		return "ProductModelResponse [id=" + modelId + "]";
	}
	
}

