package com.dev.frontend.intg.models;

import java.math.BigDecimal;
import java.util.Date;

public class OrderItem implements java.io.Serializable {

	private static final long serialVersionUID = -8539641949140893526L;

	private Integer orderItemId;
	private OrderItemStatus orderItemStatus;
	private Product product;
	private SalesOrder salesOrder;
	private int quantity;
	private BigDecimal totalPrice;
	private Date updatedDate;
	private Date createdDate;

	public Integer getOrderItemId() {
		return this.orderItemId;
	}

	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}

	public OrderItemStatus getOrderItemStatus() {
		return this.orderItemStatus;
	}

	public void setOrderItemStatus(OrderItemStatus orderItemStatus) {
		this.orderItemStatus = orderItemStatus;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public SalesOrder getSalesOrder() {
		return this.salesOrder;
	}

	public void setSalesOrder(SalesOrder salesOrder) {
		this.salesOrder = salesOrder;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
