package com.dev.frontend.intg.models;

public class OrderItemStatus implements java.io.Serializable {

	private static final long serialVersionUID = -7603874987844012038L;

	private Integer orderItemStatusId;
	private String orderItemStatus;
	private String orderItemStatusDesc;

	public Integer getOrderItemStatusId() {
		return this.orderItemStatusId;
	}

	public void setOrderItemStatusId(Integer orderItemStatusId) {
		this.orderItemStatusId = orderItemStatusId;
	}

	public String getOrderItemStatus() {
		return this.orderItemStatus;
	}

	public void setOrderItemStatus(String orderItemStatus) {
		this.orderItemStatus = orderItemStatus;
	}

	public String getOrderItemStatusDesc() {
		return this.orderItemStatusDesc;
	}

	public void setOrderItemStatusDesc(String orderItemStatusDesc) {
		this.orderItemStatusDesc = orderItemStatusDesc;
	}

}
