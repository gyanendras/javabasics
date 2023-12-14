package com.cgi.b3.domain;

public class Customer {
	
	private Long customerID; 
	private String firstName;
	private String lastName;
	
	public Customer() {
		super();
	}

	public Customer(Long customerID, String firstName, String lastName) {
		super();
		this.customerID = customerID;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
}
