package com.productmanagement.repo;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.productmanagement.dao.ProductInventory;
import com.productmanagement.repos.ProductCatalogRepo;

@RunWith(SpringRunner.class)
@DataJpaTest(showSql = true)
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class ProductRepoTest {

	@Autowired
	ProductCatalogRepo repo;

	@Test
	public void testfetchAllValue() {
		Optional<ProductInventory> findById = repo.findById(1);
		ProductInventory productInventory = findById.get();
		Assert.assertEquals("500", productInventory.getPrice());
	}
}
