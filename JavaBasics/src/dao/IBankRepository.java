package dao;

import entity.Account;
import entity.Customer;

public interface IBankRepository {
	boolean createAccount(Customer customer, long accNo, String accType, float balance );
	//list

	Account[] listAccounts();
}
