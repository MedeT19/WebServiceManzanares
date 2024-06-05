package com.tecnm.mx.Product.dto;

import java.io.Serializable;

public class SubCategoryDto  implements Serializable{
    
    private static final long serialVersionUID = 1L;
	protected int productcategoryID;
	protected String name;

    public int getProductCategoryID() {
		return productcategoryID;
	}
	public void setProductCategoryID(int productcategoryID) {
		this.productcategoryID = productcategoryID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public SubCategoryDto(int productcategoryID,int subId, String name) {
		super();
		this.productcategoryID = productcategoryID;
		this.name = name;
	}
    public SubCategoryDto() {
		super();
	}
	@Override
	public String toString() {
		return "SubCategoryDto [Product category ID=" + productcategoryID  + ",name=" + name+ "]";
	}
}