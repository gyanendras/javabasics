package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dao.BankRepositoryImpl;
import dao.IBankRepository;
import entity.Account;
import entity.Customer;

class BankRepositoryImplTest {

	@Test
	void testCreateAccount() {
		IBankRepository ibr = new BankRepositoryImpl(); 
		System.out.println("In the test method");
		Customer c = new Customer(Math.round(Math.random()*100000000), "Tom1", "Handa1");
		assertEquals(true, ibr.createAccount(c, 1002,Account.AccountType.Savings.toString(), 0.0f));
	}
	
	@Test
	void testListOfAccountsInBank() {
		IBankRepository ibr = new BankRepositoryImpl(); 
		Account[] accounts = ibr.listAccounts();
		assertEquals(true, accounts.length>0);
	}

}
