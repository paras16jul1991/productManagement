package com.productmanagement.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.productmanagement.services.interfaces.ProductService;

@RunWith(SpringRunner.class)
@WebMvcTest(ProductCatalogController.class)
public class ProductCatalogControllerTest {

	@Autowired
	MockMvc mockMvc;

	@MockBean
	ProductService service;

	@Before
	public void steup() {

	}

	@Test
	public void testProductsReturnsListofProduct() throws Exception {

		mockMvc.perform(MockMvcRequestBuilders.get("/inventory/products").accept(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	@Test
	public void testProductByIDProduct() throws Exception {

		mockMvc.perform(MockMvcRequestBuilders.get("/inventory/product?id=1").accept(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk());
	}
}
