package com.productmanagement.integeration;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Timed;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import com.productmanagement.controller.ProductCatalogController;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductCatalogControllerIntegTest {

	MockMvc mockMvc;

	@Autowired
	ProductCatalogController controller;

	@Before
	public void steup() {
		mockMvc = standaloneSetup(this.controller).build();
	}

	@Test
	@Timed(millis = 3000)
	public void testProductsReturnsListofProduct() throws Exception {

		mockMvc.perform(MockMvcRequestBuilders.get("/inventory/product?id=1").accept(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().is2xxSuccessful());
	}
}
