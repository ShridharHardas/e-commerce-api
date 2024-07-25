package org.dnynyog.dto;

public class UpdateUserResponce {
	private String codeResponce;
	private String message;
	private UpdateUserRequest request;
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
	public UpdateUserRequest getRequest() {
		return request;
	}
	public void setRequest(UpdateUserRequest request) {
		this.request = request;
	}
}
