package com.productmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.productmanagement.services.OrderService;

@RestController
@RequestMapping("/order")
@ConditionalOnBean(OrderService.class)
// @OrderFeatureCondition
public class OrderController {

	@Autowired /* (required = false) */
	OrderService orderService;

	@GetMapping("/save")
	public String createOrder() {

		return orderService.createOrder();
		
		
	}
}
