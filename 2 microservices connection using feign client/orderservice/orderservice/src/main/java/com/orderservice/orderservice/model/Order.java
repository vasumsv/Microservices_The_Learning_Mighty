package com.orderservice.orderservice.model;

public class Order {

	private Long orderId;
	private String productName;
	private Long userId;
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Order(Long orderId, String productName, Long userId) {
		super();
		this.orderId = orderId;
		this.productName = productName;
		this.userId = userId;
	}
	public Order() {
		super();
		 
	}
	
	
}
