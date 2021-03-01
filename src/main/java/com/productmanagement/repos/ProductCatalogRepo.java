package com.productmanagement.repos;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.productmanagement.dao.Product;
import com.productmanagement.dao.ProductInventory;

public interface ProductCatalogRepo
		extends PagingAndSortingRepository<ProductInventory, Integer>, JpaSpecificationExecutor<Product> {

}
