package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cgi.b3.util.DBConnUtil;
import com.cgi.b3.util.DBPropertyUtil;

import entity.Account;
import entity.Customer;

public class BankRepositoryImpl implements IBankRepository {

	@Override
	public boolean createAccount(Customer customer, long accNo, String accType, float balance) {
		String conStr = DBPropertyUtil.getConnectionString("resources\\Application.properties");
		Connection con = DBConnUtil.getDBConnection(conStr);
		String acc = "insert into Accounts values (?,?,?,?)";
		boolean created = false;
		
		
		try {
			PreparedStatement ps = con.prepareStatement(acc);
			ps.setLong(1,customer.getCustomerID());
			ps.setLong(2,  1001);
			ps.setString(3,accType);
			ps.setFloat(4, balance);
			created = ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return created;
	}

	
	//List Accounts
}
