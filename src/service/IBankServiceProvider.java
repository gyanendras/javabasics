package service;

import entity.Account;
import entity.Customer;

public interface IBankServiceProvider {
	boolean createAccount(Customer customer, long accNo, String accType, float balance);
	//listAccount
	//

}
