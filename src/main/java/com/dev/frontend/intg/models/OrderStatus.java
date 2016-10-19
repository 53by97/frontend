package com.dev.frontend.intg.models;


public class OrderStatus implements java.io.Serializable {

	private static final long serialVersionUID = -4983661292980766225L;

	private Integer orderStatusId;
	private String orderStatus;
	private String orderStatusDesc;

	public Integer getOrderStatusId() {
		return this.orderStatusId;
	}

	public void setOrderStatusId(Integer orderStatusId) {
		this.orderStatusId = orderStatusId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderStatusDesc() {
		return this.orderStatusDesc;
	}

	public void setOrderStatusDesc(String orderStatusDesc) {
		this.orderStatusDesc = orderStatusDesc;
	}

}
