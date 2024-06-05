package com.tecnm.mx.Product.dto;

import java.io.Serializable;

public class CategoryDto implements Serializable{

    private static final long serialVersionUID = 1L;
	protected String name;


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public CategoryDto(String productCategoryID, String name) {
		super();
		this.name = name;
	}
    public CategoryDto() {
		super();
	}
	@Override
	public String toString() {
		return "CategoryDto [ name=" + name+ "]";
	}
}
