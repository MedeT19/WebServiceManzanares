package com.tecnm.mx.Product.dto;


import java.io.Serializable;


public class ProductModelProductDto implements Serializable{
	/**
	 * 
	 */
		private static final long serialVersionUID = 1L;
		protected String registDate;	
		protected CultureResponse cultureId;
		protected ProductModelResponse modelId;
		protected ProductDescriptionResponse descId;
		
		public ProductModelProductDto(String registDate, CultureResponse cultureId, ProductModelResponse modelId, ProductDescriptionResponse descId) {
			super();
			this.registDate = registDate;
			this.cultureId = cultureId;
			this.modelId = modelId;
			this.descId = descId;
		}

		public ProductModelProductDto() {
			super();
			this.registDate = "";
			this.cultureId = null;
			this.modelId = null;
			this.descId = null;
		}

		public String getDate() {
			return registDate;
		}

		public void setDate(String registDate) {
			this.registDate = registDate;
		}

		public CultureResponse getCultureID() {
			return cultureId;
		}

		public void setCultureID(CultureResponse cultureId) {
			this.cultureId = cultureId;
		}

		public ProductModelResponse getModel() {
			return modelId;
		}

		public void setModel(ProductModelResponse modelId) {
			this.modelId = modelId;
		}

		public ProductDescriptionResponse getDesc() {
			return descId;
		}

		public void setDesc(ProductDescriptionResponse descId) {
			this.descId = descId;
		}
		
		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Override
		public String toString() {
			return "ProductDto [ProductModelId=" + modelId + ", ProductDescription=" + descId + ", CultureID=" + cultureId 
			+ ", ModifiedDate=" + registDate +"]";
		}
	}