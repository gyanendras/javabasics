package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
			ps.setLong(2,  customer.getCustomerID());
			ps.setString(3,accType);
			ps.setFloat(4, balance);
			ps.execute();
			created = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return created;
	}

	@Override
	public Account[] listAccounts() {
		String conStr = DBPropertyUtil.getConnectionString("resources\\Application.properties");
		Connection con = DBConnUtil.getDBConnection(conStr);
		String acc = "select * from Accounts";
		boolean created = false;
		ArrayList<Account> ls = null;
		
		try {
			PreparedStatement ps = con.prepareStatement(acc);
			ResultSet rs = ps.executeQuery();
			 ls = new ArrayList<>();
			while(rs.next()) {
				Customer c = new Customer(rs.getLong(2), "Tom1", "Handa1");
				ls.add(new Account(rs.getLong(1),rs.getDouble(4),c ));
			}
			created = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Account [] acctArr = new Account[30];
		acctArr = ls.toArray(acctArr) ;
		return acctArr;
	}

	
	//List Accounts
}
