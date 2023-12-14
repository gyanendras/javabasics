package app;

import bean.BankServiceProviderImpl;
import entity.Account;
import entity.Customer;
import service.IBankServiceProvider;

/*
 * This is main Bank app class
 */
public class Bank {
	IBankServiceProvider ibs = new BankServiceProviderImpl();
	
	boolean createAccount(Customer customer, long accNo, String accType, float balance) {
		return ibs.createAccount(customer, accNo, accType, balance);
		
	}

}
