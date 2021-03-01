package com.productmanagement.services;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnExpression("${features.order.enabled} == true")
public class OrderService {

	public String createOrder() {

		return "Success";
	}
}
