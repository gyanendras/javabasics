package bean;

import dao.BankRepositoryImpl;
import entity.Account;
import entity.Customer;
import service.IBankServiceProvider;
import dao.IBankRepository;

public class BankServiceProviderImpl implements IBankServiceProvider {
	
	IBankRepository ibp = new BankRepositoryImpl();

	@Override
	public boolean createAccount(Customer customer, long accNo, String accType, float balance) {
		
		return ibp.createAccount(customer, accNo, accType, balance);
	}

}
