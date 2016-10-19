package com.dev.frontend.intg.models;

import java.util.Date;

public class Address implements java.io.Serializable {

	private static final long serialVersionUID = 8245856806324044053L;

	private Integer addressId;
	private String address;
	private String landmark;
	private String location;
	private Integer pinCode;
	private String city;
	private String country;
	private Date updatedDate;
	private Date createdDate;

	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLandmark() {
		return this.landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getPinCode() {
		return this.pinCode;
	}

	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
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
