package com.demo.responses;

public class FailureResponse {
	
	private boolean flag;
	private String message;
	
	public FailureResponse() {
		this.flag = false;
		this.message = "failure";
	}

	public boolean getFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
