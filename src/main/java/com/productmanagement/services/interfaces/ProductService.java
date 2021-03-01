package com.productmanagement.services.interfaces;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.productmanagement.dao.Product;
import com.productmanagement.dao.ProductInventory;

public interface ProductService {

	Optional<Product> fetchById(String id);

	Optional<Product> fetchByColor();

	List<Product> fetchAll();

	public Page<ProductInventory> fetchAll(Pageable pageable);

	List<Product> fetchAll(Predicate<Product> predicate);

	String save();

	String update();

}
