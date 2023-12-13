package com.cgi.b3.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return con;

	}

	public static void main(String[] args) {
		String conStr = DBPropertyUtil.getConnectionString("resources\\Application.properties");
		Connection con = DBConnUtil.getDBConnection(conStr);
		System.out.println(con);

	}

}
