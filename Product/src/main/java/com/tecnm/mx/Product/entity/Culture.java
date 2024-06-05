package com.tecnm.mx.Product.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema="Production",name="culture")
public class Culture implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cultureID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String  cultureId;
	
	@Column
	private String name;
	


	public String getCultureId() {
		return cultureId;
	}

	public void setCultureId(String cultureId) {
		this.cultureId = cultureId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Culture(String cultureId, String name) {
		super();
		this.cultureId = cultureId;
		this.name = name;
	
	}

	public Culture() {
		super();
		this.cultureId = "";
		this.name = "";
	
	}

	@Override
	public String toString() {
		return "Culture [id=" + cultureId + ", name=" + name + "]";
	}
	
}
