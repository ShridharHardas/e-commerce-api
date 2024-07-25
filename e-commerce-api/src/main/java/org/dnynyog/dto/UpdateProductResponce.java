package org.dnynyog.dto;

public class UpdateProductResponce {
	private String codeResponce;
	private String message;
	private UpdateProductRequest request;
	public UpdateProductRequest getRequest() {
		return request;
	}
	public void setRequest(UpdateProductRequest request) {
		this.request = request;
	}
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
}
