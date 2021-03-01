package com.productmanagement.exception;

public class ProductNotFoundException extends RuntimeException {

	public ProductNotFoundException() {
	}

	@Override
	public String getMessage() {
		return "Product Not found";
	}
}
