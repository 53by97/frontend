package com.dev.frontend.intg.models;

import java.math.BigDecimal;
import java.util.Date;

public class Customer implements java.io.Serializable {

	private static final long serialVersionUID = 348641849334604392L;

	private Integer custId;
	private Address address;
	private String custName;
	private BigDecimal currentCredit;
	private BigDecimal creditLimit;
	private String primaryContactNumber;
	private String secondaryContactNumber;
	private Date updatedDate;
	private Date createdDate;

	public Integer getCustId() {
		return this.custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCustName() {
		return this.custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public BigDecimal getCurrentCredit() {
		return this.currentCredit;
	}

	public void setCurrentCredit(BigDecimal currentCredit) {
		this.currentCredit = currentCredit;
	}

	public BigDecimal getCreditLimit() {
		return this.creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getPrimaryContactNumber() {
		return this.primaryContactNumber;
	}

	public void setPrimaryContactNumber(String primaryContactNumber) {
		this.primaryContactNumber = primaryContactNumber;
	}

	public String getSecondaryContactNumber() {
		return this.secondaryContactNumber;
	}

	public void setSecondaryContactNumber(String secondaryContactNumber) {
		this.secondaryContactNumber = secondaryContactNumber;
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
