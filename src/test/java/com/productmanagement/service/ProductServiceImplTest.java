package com.productmanagement.service;

import java.util.List;
import java.util.function.Predicate;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import com.productmanagement.dao.Product;
import com.productmanagement.repos.ProductCatalogRepo;
import com.productmanagement.services.ProductServiceImpl;

@RunWith(SpringRunner.class)
public class ProductServiceImplTest {

	@InjectMocks
	ProductServiceImpl productServiceImpl;

	@Mock
	ProductCatalogRepo repo;

	@Test
	public void TestfetchAllValid() {
		List<Product> fetchAll = productServiceImpl.fetchAll();
		Assert.assertEquals(null, fetchAll);
	}

}
