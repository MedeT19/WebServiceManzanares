package com.tecnm.mx.Product.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema="Production",name="Productsubcategory")

public class SubCategory implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    @Id
	@Column(name="productsubcategoryID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer subId;
	
	@Column
	private int productcategoryID;
    @Column
	private String name;
	
	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

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


	public SubCategory(int subId,int productcategoryID, String name) {
		super();
		this.subId = subId;
        this.productcategoryID = productcategoryID;
		this.name = name;
	
	}

	public SubCategory() {
		super();
		this.subId = 0;
        this.productcategoryID = 0;
		this.name = "";
	
	}

	@Override
	public String toString() {
		return "SubCategory [Id Model=" + subId + ",Id Category=" + productcategoryID + ", name=" + name + "]";
	}
	
	
}	