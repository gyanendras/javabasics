package entity;

public class Account {
	Long accountNumber;
	static public enum AccountType{Savings, Current};
	double accountBalance;
	Customer customer;
	
	public Account(Long accountNumber, double accountBalance, Customer customer) {
		super();
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.customer = customer;
	}
	
	

}
