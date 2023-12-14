package entity;

public class Account {
	Long accountNumber;
	static public enum AccountType{Savings, Current};
	double accountBalance;
	Customer customer;

}
