package com.lti.model;

public class Product {

	int productId;
	String prodName;
	String prodDescription;
	int quantity;
	double price;
	public double getPrice(){
		return price;
	}

	public int getQuantity(){
		return quantity;
	}
	public int getProductId() {
		return productId;
	}
	

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDescription() {
		return prodDescription;
	}

	public void setProdDescription(String prodDescription) {
		this.prodDescription = prodDescription;
	}

}
