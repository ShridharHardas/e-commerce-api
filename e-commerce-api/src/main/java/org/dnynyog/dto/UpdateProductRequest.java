package org.dnynyog.dto;

public class UpdateProductRequest {
	private Integer product_id;
	private String productName;
	private int productQuantity;
	private long productPrice;
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}
}
