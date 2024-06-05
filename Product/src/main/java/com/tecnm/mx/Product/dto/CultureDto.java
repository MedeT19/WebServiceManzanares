package com.tecnm.mx.Product.dto;

import java.io.Serializable;

public class CultureDto  implements Serializable{
    
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
	public CultureDto( String name) {
		super();
		this.name = name;
	}
    public CultureDto() {
		super();
	}
	@Override
	public String toString() {
		return "CultureDto [name=" + name+ "]";
	}
}