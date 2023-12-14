package com.cgi.b3.service;

import com.cgi.b3.domain.Customer;

public interface ICustomerService {
	
	Customer getCustomerById(Long customerId);
	Customer GetCustomerByUsername(String username);
    Customer RegisterCustomer(Customer customer);
	Customer UpdateCustomer(Customer customer);
	Customer DeleteCustomer(Long customerId);

}
