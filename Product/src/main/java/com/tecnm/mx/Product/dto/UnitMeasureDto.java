package com.tecnm.mx.Product.dto;

import java.io.Serializable;

public class UnitMeasureDto  implements Serializable{
    
    private static final long serialVersionUID = 1L;
	protected String name;
	private Integer unitCode;


	public int getUnitCode() {
		return unitCode;
	}

	public void setUnitCode(int unitCode) {
		this.unitCode = unitCode;
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
	public UnitMeasureDto(int unitCode, String name) {
		super();
		this.unitCode = unitCode;
		this.name = name;
	}
    public UnitMeasureDto() {
		super();
	}
	@Override
	public String toString() {
		return "UnitMeasure [name=" + name + "id=" + unitCode +"]";
	}
}