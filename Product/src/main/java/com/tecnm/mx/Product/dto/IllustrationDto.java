package com.tecnm.mx.Product.dto;

import java.io.Serializable;

public class IllustrationDto implements Serializable{
    
    private static final long serialVersionUID = 1L;
	protected String diagram;

    public String getDiagram() {
		return diagram;
	}
	public void setDiagram(String diagram) {
		this.diagram = diagram;
	}
	
    public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public IllustrationDto(int id,String diagram) {
		super();
		this.diagram = diagram;

	}
    public IllustrationDto() {
		super();
	}
	@Override
	public String toString() {
		return "CultureDto [Diagram=" + diagram + " ]";
	}
}