package com.productmanagement.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ProductNotFoundException.class)
	public ErrorResponse exceptionMethod(Exception e) {
		return new ErrorResponse("5001", e.getMessage());
	}
}
