package com.tecnm.mx.Product.dto;

import java.io.Serializable;

public class ProductDto implements Serializable {

    private static final long serialVersionUID = 1L;
	protected String name;	
	protected String productNumber;	
	protected SubCategoryResponse subId;
    protected ProductModelResponse modelId;
	
	public ProductDto(String name, String productNumber, SubCategoryResponse subId,ProductModelResponse modelId) {
		super();
		this.name = name;
		this.productNumber = productNumber;
		this.subId = subId;
        this.modelId = modelId;
	}

	public ProductDto() {
		super();
		this.name = "";
		this.productNumber = "";
		this.subId = null;
        this.modelId = null;
	}

	public String getName() {
		return productNumber;
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


	public SubCategoryResponse getSubCategory() {
		return subId;
	}

	public void setSubCategory(SubCategoryResponse subId) {
		this.subId = subId;
	}

    public ProductModelResponse getModel() {
		return modelId;
	}

	public void setModel(ProductModelResponse modelId) {
		this.modelId = modelId;
	}


	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ProductDto [name=" + name + ", productNumber=" + productNumber + ",subCategoria Id=" + subId + ",ModelId=" + modelId +"]";
	}
	
	
}






