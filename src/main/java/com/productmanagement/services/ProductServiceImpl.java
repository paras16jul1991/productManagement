package com.productmanagement.services;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.productmanagement.dao.Product;
import com.productmanagement.dao.ProductInventory;
import com.productmanagement.repos.ProductCatalogRepo;
import com.productmanagement.services.interfaces.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductCatalogRepo repo;

	public List<Product> fetchAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public String save() {
		// TODO Auto-generated method stub
		return null;
	}

	public String update() {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<Product> fetchById(String id) {
		Optional<ProductInventory> findById = repo.findById(Integer.valueOf(id));
		ProductInventory productInventory = findById.get();
		Product product = new Product();
		product.setName(productInventory.getName());
		return Optional.ofNullable(product);
	}

	public Optional<Product> fetchByColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> fetchAll(Predicate<Product> predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<ProductInventory> fetchAll(Pageable pageable) {
		return repo.findAll(pageable);

	}

}
