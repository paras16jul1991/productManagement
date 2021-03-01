package com.productmanagement.util;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.productmanagement.utl.DBUtil;
import com.productmanagement.utl.OrderUtil;

public class OrderUtilTest {

	OrderUtil orderUtil;

	@Before
	public void setup() {
		DBUtil dbUtil = Mockito.mock(DBUtil.class);
		Mockito.when(dbUtil.count()).thenReturn(2);
		orderUtil = new OrderUtil(dbUtil);
	}

	@Test
	public void testOrderCountValid() {

		Assert.assertEquals(1, orderUtil.getOrderCount());

	}
}
