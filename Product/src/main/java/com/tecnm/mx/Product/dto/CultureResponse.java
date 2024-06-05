package com.tecnm.mx.Product.dto;

import java.io.Serializable;

public class CultureResponse extends CultureDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String cultureId;

	public CultureResponse(String cultureId) {
		super();
		this.cultureId = cultureId;
	}

	public CultureResponse() {
		super();
	}

	public String getCultureId() {
		return cultureId;
	}

	public void setCultureId(String cultureId) {
		this.cultureId = cultureId;
	}

	@Override
	public String toString() {
		return "CultureId [id=" + cultureId + "]";
	}
    }