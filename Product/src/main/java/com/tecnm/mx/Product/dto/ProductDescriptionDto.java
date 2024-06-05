package com.tecnm.mx.Product.dto;

import java.io.Serializable;

public class ProductDescriptionDto implements Serializable{
    
    private static final long serialVersionUID = 1L;
	protected String description;

	public String getDescrip() {
		return description;
	}
	public void setDescrip(String description) {
		this.description = description;
	}

    public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public ProductDescriptionDto(int descId, String description) {
		super();
		this.description = description;
	}
    public ProductDescriptionDto() {
		super();
	}
	@Override
	public String toString() {
		return "CategoryDto [Description=" + description+ "]";
	}
}

