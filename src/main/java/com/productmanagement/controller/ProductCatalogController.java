package com.productmanagement.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.productmanagement.dao.Filter;
import com.productmanagement.dao.Product;
import com.productmanagement.dao.ProductInventory;
import com.productmanagement.exception.ErrorResponse;
import com.productmanagement.exception.ProductNotFoundException;
import com.productmanagement.services.interfaces.ProductService;

@RestController
@RequestMapping("/inventory")
public class ProductCatalogController {

	@Autowired
	ProductService productServiceImpl;

	@Cacheable("products")
	@GetMapping("/products")
	public Page<ProductInventory> fetch(@RequestParam("page") int page, @RequestParam("size") int size,
			@RequestParam("sortBy") String sortBy) {
		List<Sort.Order> orders = new ArrayList<>();
		orders.add(new Sort.Order(Sort.Direction.ASC, sortBy));
		Pageable pageable = PageRequest.of(page, size, Sort.by(orders));
		return productServiceImpl.fetchAll(pageable);
	}

	@GetMapping("/products/filter")
	public List<Product> fetchFilter(@RequestParam("filterBy") String filter,
			@RequestParam("filterValue") String filterValue) {
		Predicate<Product> predicate = x -> true;
		if (filter.equalsIgnoreCase(Filter.Color.toString()))
			predicate = x -> x.getColor().equalsIgnoreCase(filter);
		return productServiceImpl.fetchAll(predicate);
	}

	@ResponseStatus(code = HttpStatus.ACCEPTED)
	@GetMapping("/product")
	public Product fetch(@RequestParam("id") String id) {

		return productServiceImpl.fetchById(id).orElseThrow(ProductNotFoundException::new);
	}


	@ExceptionHandler(ProductNotFoundException.class)
	public ErrorResponse exceptionMethod(Exception e) {
		return new ErrorResponse("5002", e.getMessage());
	}
}
