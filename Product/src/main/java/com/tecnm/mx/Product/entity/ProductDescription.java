package com.tecnm.mx.Product.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(schema="Production",name="productdescription")
public class ProductDescription implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="productdescriptionid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer descId;
	
	@Column
	private String description;
	
	public int getDescId() {
		return descId;
	}

	public void setDescId(int descId) {
		this.descId = descId;
	}

	public String getDescrip() {
		return description;
	}

	public void setDescrip(String description) {
		this.description = description;
	}


	public ProductDescription(int descId, String description) {
		super();
		this.descId = descId;
		this.description = description;
	
	}

	public ProductDescription() {
		super();
		this.descId = 0;
		this.description = "";
	
	}

	@Override
	public String toString() {
		return "ProductDescription [id=" + descId + ", Description=" + description + "]";
	}
	
	
	
	
}