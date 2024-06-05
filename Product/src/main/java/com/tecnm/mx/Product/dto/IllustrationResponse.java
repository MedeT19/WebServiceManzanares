package com.tecnm.mx.Product.dto;

import java.io.Serializable;

public class IllustrationResponse extends IllustrationDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;

	public IllustrationResponse(int id) {
		super();
		this.id = id;
	}

	public IllustrationResponse() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "IllustrationResponse [id=" + id + "]";
	}
	
}
