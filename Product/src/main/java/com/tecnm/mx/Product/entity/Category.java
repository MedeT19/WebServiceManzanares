package com.tecnm.mx.Product.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema="Production",name="Productcategory")
public class Category implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="productcategoryid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productCategoryID;
	
	@Column
	private String name;
	
	public int getProductCategoryId() {
		return productCategoryID;
	}

	public void setProductCategoryId(int productCategoryID) {
		this.productCategoryID = productCategoryID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Category(int productCategoryID, String name) {
		super();
		this.productCategoryID = productCategoryID;
		this.name = name;
	
	}

	public Category() {
		super();
		this.productCategoryID = 0;
		this.name = "";
	
	}

	@Override
	public String toString() {
		return "Category [id=" + productCategoryID + ", name=" + name + "]";
	}
	
	
	
	
}