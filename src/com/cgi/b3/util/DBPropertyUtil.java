package com.cgi.b3.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DBPropertyUtil {

	public static String getConnectionString(String fileName) {
		Properties p = new Properties();

		FileInputStream fis = null;

		try {
			fis = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		try {
			p.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return p.getProperty("url.prefix") 
			+p.getProperty("username")+":"
			+p.getProperty("password")+"@"
		    +p.getProperty("dbserver") + ":" 
			+ p.getProperty("port") + "/"
			+ p.getProperty("dbname");
	}

	public static String getClassName(String fileName) {
        Properties p = new Properties();
		
		FileInputStream fis=null;
		
		try {
			fis = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			p.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return p.getProperty("driver-class-name");
	}

	public static void main(String[] args) {
		String s = DBPropertyUtil.getConnectionString("resources\\Application.properties");
		System.out.println(s);
		
		String className = DBPropertyUtil.getClassName("resources\\\\Application.properties");
		System.out.println(className);
		
	}
}
