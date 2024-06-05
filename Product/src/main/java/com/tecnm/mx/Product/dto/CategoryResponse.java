package com.tecnm.mx.Product.dto;

import java.io.Serializable;

public class CategoryResponse  extends CategoryDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer productCategoryID;

	public CategoryResponse(int productCategoryID) {
		super();
		this.productCategoryID = productCategoryID;
	}

	public CategoryResponse() {
		super();
	}

	public int getProductCategoryID() {
		return productCategoryID;
	}

	public void setProductCategoryID(int productCategoryID) {
		this.productCategoryID = productCategoryID;
	}

	@Override
	public String toString() {
		return "CategoryResponse [id=" + productCategoryID + "]";
	}
	
	
}