package com.productmanagement.utl;

public class OrderUtil {

	DBUtil util;

	public OrderUtil(DBUtil util) {
		this.util = util;
	}

	public int getOrderCount() {
		return util.count();
	}
}
