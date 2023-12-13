package app;

import entity.Account;
import entity.Customer;

public class BankApp {

	public static void main(String[] args) {
		System.out.println("Create Account");
		Bank b = new Bank();
		b.createAccount(new Customer(1l, "Tom", "Handa"),1l, Account.AccountType.Savings.toString(), 0.0f);
		
		

	}

}
