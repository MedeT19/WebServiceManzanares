package com.tecnm.mx.Product.dto;

import java.io.Serializable;

public class ProductDescriptionResponse extends ProductDescriptionDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer descId;

	public ProductDescriptionResponse(int descId) {
		super();
		this.descId = descId;
	}

	public ProductDescriptionResponse() {
		super();
	}

	public int getDescId() {
		return descId;
	}

	public void setDescId(int descId) {
		this.descId = descId;
	}

	@Override
	public String toString() {
		return "ProductDescriptionResponse [id=" + descId + "]";
	}
	
}

