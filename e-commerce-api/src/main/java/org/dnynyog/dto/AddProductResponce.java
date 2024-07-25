package org.dnynyog.dto;

public class AddProductResponce {
	private String codeResponce;
	private String message;
	private Integer product_id;
	private AddProductRequest request;
	public String getCodeResponce() {
		return codeResponce;
	}
	public void setCodeResponce(String codeResponce) {
		this.codeResponce = codeResponce;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
	public AddProductRequest getRequest() {
		return request;
	}
	public void setRequest(AddProductRequest request) {
		this.request = request;
	}
	

}
