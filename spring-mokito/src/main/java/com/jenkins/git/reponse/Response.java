package com.jenkins.git.reponse;

import lombok.Data;

@Data
public class Response {
	private String message;
	private boolean status;
	
	public Response(String message, boolean status) {
		super();
		this.message = message;
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
