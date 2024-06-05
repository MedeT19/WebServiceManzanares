package com.tecnm.mx.Product.dto;

import java.io.Serializable;

public class ProductModelDto implements Serializable{
    
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
	public ProductModelDto(String name) {
		super();
		this.name = name;
	}
    public ProductModelDto() {
		super();
	}
	@Override
	public String toString() {
		return "ProductModelDto [name=" + name+ "]";
	}
}