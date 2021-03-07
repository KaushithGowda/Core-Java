package com.practise.jdbc11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

public class MySQLDateSelectApp {

	private static String SQLSELECTQUERY = "select * from cricketerstats where cid=19";

	public static void main(String[] args) {

		// Resources used
		FileInputStream fileInputStream = null;
		Scanner scanner = null;
		Connection connection = null;
		PreparedStatement preparedstatement = null;
		ResultSet resultSet = null;

		// local variables used

		// took file name from command line
		String fileName = "F:\\Code\\Java\\PractiseAdvance\\src\\com\\practise\\resources\\" + args[0];

		try {

			// get the information from the filename to java code
			fileInputStream = new FileInputStream(fileName);

			// creating object of Properties file to get the data
			Properties properties = new Properties();

			// loading of properties using fileInputStream
			properties.load(fileInputStream);

			// use keys of Properties file to get the value
			String url = properties.getProperty("jdbc.url");
			String username = properties.getProperty("jdbc.username");
			String password = properties.getProperty("jdbc.password");

			System.out.println("the url is:: " + url);
			System.out.println("the username is:: " + username);
			System.out.println("the password is:: " + password);

			// step.1 load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded!");

			// step.2 establishing the connection btw java app and dB
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connected to dB!");

			if (connection != null) {

				// step.3 creating PreparedStatement object
				preparedstatement = connection.prepareStatement(SQLSELECTQUERY);

				if (preparedstatement != null) {

					System.out.println("Query executed by DBE:: " + SQLSELECTQUERY);

					// step.4 executing the query
					resultSet = preparedstatement.executeQuery();

					if (resultSet != null) {

						System.out.println("cid" + "\t" + "cdod");
					
						while(resultSet.next() != false) {
		            	 	
	            	 		//retriving using index value
	            	 		int cid = resultSet.getInt(1);
//	            	 		int cdod = resultSet.getDate(cdod);
	            	 		System.out.println(cid);
						}
					}
				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Exception occured due to :: " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("sqlexception:: " + e.getMessage());
		} catch (FileNotFoundException e1) {
			System.out.println(e1.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (preparedstatement != null) {
				try {
					preparedstatement.close();
				} catch (Exception e) {
					e.getMessage();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (Exception e) {
					e.getMessage();
				}
			}
			if (scanner != null) {
				try {
					scanner.close();
				} catch (Exception e) {
					e.getMessage();
				}
			}
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
