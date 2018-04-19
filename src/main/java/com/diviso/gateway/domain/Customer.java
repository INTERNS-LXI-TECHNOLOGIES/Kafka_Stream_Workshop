package com.diviso.gateway.domain;

public class Customer {

	private long id;
	private String name;
	private String contactNumber;
	private long loyaltyPoint;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public long getLoyaltyPoint() {
		return loyaltyPoint;
	}
	public void setLoyaltyPoint(long loyaltyPoint) {
		this.loyaltyPoint = loyaltyPoint;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	

	
	
}
