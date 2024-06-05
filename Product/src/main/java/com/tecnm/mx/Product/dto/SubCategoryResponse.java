package com.tecnm.mx.Product.dto;

import java.io.Serializable;

public class SubCategoryResponse extends SubCategoryDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer subId;

	public SubCategoryResponse(int subId) {
		super();
		this.subId = subId;
	}

	public SubCategoryResponse() {
		super();
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	@Override
	public String toString() {
		return "SubCategoryResponse [id=" + subId + "]";
	}
	
}
