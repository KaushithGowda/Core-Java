package com.abc.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {

		Connection connection = null;
		//UrlPattern:"protocolName:subprotocolName:<ipaddress_db_Machine>:<port_no>:<dbName>"
		String url = "jdbc:mysql://localhost:3306/e_commerce";
		String user = "root";
		String password = "9986830462#K";
		
		try {
		//step1.loading and registering the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Loading the driver");
		
		//step2.establishing the connection b/w java application and database(MySQL)
		connection = DriverManager.getConnection(url, user, password);
		
		if(connection != null)
		{
			System.out.println("connected to database");
			
			//3.
		}
		
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
