package com.demo.responses;

public class SuccessResponse {
	
	private boolean flag;
	private String message;
	
	public SuccessResponse() {
		this.flag = true;
		this.message = "success";
	}

	public boolean isFlag() {
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
