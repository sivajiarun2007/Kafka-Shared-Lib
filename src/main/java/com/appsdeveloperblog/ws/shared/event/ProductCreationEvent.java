package com.appsdeveloperblog.ws.shared.event;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ProductCreationEvent {

	private String productId;
	private String name;
	private BigDecimal price;
	private BigInteger quantity;

	public ProductCreationEvent() {

	}

	public ProductCreationEvent(String productId, String name, BigDecimal price, BigInteger quantity) {
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigInteger getQuantity() {
		return quantity;
	}

	public void setQuantity(BigInteger quantity) {
		this.quantity = quantity;
	}

}
