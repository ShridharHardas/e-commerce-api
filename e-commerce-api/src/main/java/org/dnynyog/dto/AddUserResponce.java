package org.dnynyog.dto;

public class AddUserResponce {
	private String codeResponce;
	private String message;
	private int user_id; 
	private AddUserRequest request;
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
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public AddUserRequest getRequest() {
		return request;
	}
	public void setRequest(AddUserRequest request) {
		this.request = request;
	}

}
