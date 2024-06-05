package com.tecnm.mx.Product.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema="Production",name="Illustration")
public class Illustration implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="illustrationID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public Illustration(int id) {
		super();
		this.id = id;
	
	}

	public Illustration() {
		super();
		this.id = 0;
	
	}

	@Override
	public String toString() {
		return "illustration [id=" + id + "]";
	}
	
}