package com.tecnm.mx.Product.dto;

import java.io.Serializable;

public class ProductModelIlustrationDto implements Serializable{
    
    private static final long serialVersionUID = 1L;
	protected Integer productModelId;
	protected Integer illustrationID;

    public int getProductModelId() {
		return productModelId;
	}
	public void setProductModelId(int productModelId) {
		this.productModelId= productModelId;
	}
	public int getIllustrationID() {
		return illustrationID;
	}
	public void setIllustrationID(int illustrationID) {
		this.illustrationID = illustrationID;
	}

    public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public ProductModelIlustrationDto(int productModelId, int illustrationID) {
		super();
		this.productModelId = productModelId;
		this.illustrationID = illustrationID;
	}
    public ProductModelIlustrationDto() {
		super();
	}
	@Override
	public String toString() {
		return "CultureDto [Product ID=" + productModelId  + ", Illustration ID=" + illustrationID+ "]";
	}
}