package com.productmanagement.config;

import org.springframework.boot.autoconfigure.condition.AnyNestedCondition;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;

public class OrderCondition extends AnyNestedCondition {

	public OrderCondition(ConfigurationPhase configurationPhase) {
		super(ConfigurationPhase.REGISTER_BEAN);
	}

	@ConditionalOnExpression("${features.order.enabled} == true")
	static class OnOrder {
	}

}
