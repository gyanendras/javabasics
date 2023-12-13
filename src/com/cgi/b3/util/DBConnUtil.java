package com.cgi.b3.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnUtil {

	public static Connection getDBConnection(String cString) {
		Connection con = null;
		try {
			String className = DBPropertyUtil.getClassName("resources\\\\Application.properties");
			Class.forName(className);
			con = DriverManager.getConnection(cString);
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return con;

	}

	public static void main(String[] args) {
		String conStr = DBPropertyUtil.getConnectionString("resources\\Application.properties");
		Connection con = DBConnUtil.getDBConnection(conStr);
		String query = " select  * from employees where employee_id between 100 and 120";
		try {
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getDate(6)+" "+rs.getDouble("salary"));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println(con);

	}

}
