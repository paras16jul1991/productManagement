package com.productmanagement.exception;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class ErrorResponse implements GenericError {

	String responseMessage;
	String responseTime;
	String responseCode;

	public ErrorResponse(String code, String message) {
		this.responseCode = code;
		this.responseMessage = message;
		this.responseTime = LocalDateTime.now().toString();
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(String responseTime) {
		this.responseTime = responseTime;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

}
