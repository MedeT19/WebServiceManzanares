package com.tecnm.mx.Product.dto;

import java.io.Serializable;

public class ProductResponse extends ProductDto implements Serializable {
    
	private static final long serialVersionUID = 1L;
	private int id;
	
	public ProductResponse(String name, String productNumber,SubCategoryResponse subId, int id,ProductModelResponse modelId) {
		super(name, productNumber, subId,modelId);
		this.id = id;
	}
	
	public ProductResponse() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
