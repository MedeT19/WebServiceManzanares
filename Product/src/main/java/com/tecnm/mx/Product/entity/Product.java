package com.tecnm.mx.Product.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(schema="Production",name="Product")
public class Product implements Serializable {
/*
 * 
 */
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name="productID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column
	String name;
	
    @Column(name="productnumber")
	String productNumber;
	
	@OneToOne
    @JoinColumn(name = "productsubcategoryID", nullable = false)
	SubCategory subCategory;

    @OneToOne
    @JoinColumn(name = "productmodelID", nullable = false)
	ProductModel model;
	
	public Product() {
		this.name = "";
		this.productNumber = "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return productNumber;
	}

	public void setNumber(String productNumber) {
		this.productNumber = productNumber;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	public SubCategory getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

    public ProductModel getModel() {
		return model;
	}

	public void setModel(ProductModel model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", ProductNumber=" + productNumber + ", Subcategory=" 
        + subCategory + ", Model=" + model +"]";
	}
	
	
}