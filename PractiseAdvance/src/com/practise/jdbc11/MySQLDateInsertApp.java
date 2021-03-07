package com.practise.jdbc11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

public class MySQLDateInsertApp {

	private static String SQLINSERTQUERY = "insert into cricketerstats values(?,?,?,?,?,?)";
	public static void main(String[] args) {

			//Resources used
			FileInputStream fileInputStream = null;
			Scanner scanner = null;
			Connection connection = null;
			PreparedStatement preparedstatement = null;
			
			//local variables used
			String cid = null;
			String cname = null;
			String caddress = null;
			String cdod = null;
			String cdom = null;
			String cdoj = null;
			java.sql.Date sqlDoj;
			java.sql.Date sqlDod = null;
			java.sql.Date sqlDom = null;
			
			// took file name from command line
			String fileName= "F:\\Code\\Java\\PractiseAdvance\\src\\com\\practise\\resources\\" + args[0];
			
			try {
				
				scanner = new Scanner(System.in);
				
				System.out.print("enter the cid:: ");
				cid = scanner.next();
				
				System.out.print("enter the cname:: ");
				cname = scanner.next();
				
				System.out.print("enter the caddress:: ");
				caddress = scanner.next();
				
				System.out.print("enter the cdod(dd-MM-YYYY):: ");
				cdod = scanner.next();
				
				System.out.print("enter the cdom(MM-dd-YYYY):: ");
				cdom = scanner.next();
				
				System.out.print("enter the cdoj(YYYY-MM-dd):: ");
				cdoj = scanner.next();
				
				//step.1 defining the date format
				SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-YYYY");
				
				if (sdf1 != null) {
					
					//step.2 coverting the string type date into java.util type using parse(<String>)
					Date udod = sdf1.parse(cdod);
					
					if (udod != null) {
						
						//step.3 converting java.util type to java.sql type date 
						sqlDod = new java.sql.Date(udod.getTime());
					}
				}

				//step.1 defining the date format
				SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-YYYY");
				
				if (sdf2 != null) {
					
					//step.2 coverting the string type date into java.util type using parse(<String>)
					Date udom = sdf2.parse(cdom);
					
					if (udom != null) {
						
						//step.3 converting java.util type to java.sql type date 
					    sqlDom = new java.sql.Date(udom.getTime());
					}
				}
				
				sqlDoj = java.sql.Date.valueOf(cdoj);
				
			    //get the information from the filename to java code
				fileInputStream = new FileInputStream(fileName);
				
				//creating object of Properties file to get the data
				Properties properties = new Properties();
				
				//loading of properties using fileInputStream
				properties.load(fileInputStream);

				//use keys of Properties file to get the value
				String url = properties.getProperty("jdbc.url");
				String username = properties.getProperty("jdbc.username");
				String password = properties.getProperty("jdbc.password");
			
				System.out.println("the url is:: "+url);
				System.out.println("the username is:: "+username);
				System.out.println("the password is:: "+password);
				
				//step.1 load and register the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver class loaded!");
			
				//step.2 establishing the connection btw java app and dB
				connection = DriverManager.getConnection(url,username,password);
				System.out.println("Connected to dB!");
				
				if(connection != null) {
					
					//step.3 creating PreparedStatement object
					preparedstatement = connection.prepareStatement(SQLINSERTQUERY);
					
						if(preparedstatement != null) {
						
							//setting the params using setXXX()
							preparedstatement.setString(1, cid);
							preparedstatement.setString(2, cname);
							preparedstatement.setString(3, caddress);
							preparedstatement.setDate(4, sqlDod);
							preparedstatement.setDate(5, sqlDom);
							preparedstatement.setDate(6, sqlDoj);

							System.out.println("Query executed by DBE:: "+SQLINSERTQUERY);
							//SQL injection is not supported by PreparedStatement object
							
							//step.4 executing the query
							int rowAffected = preparedstatement.executeUpdate();
							
									if (rowAffected == 0) {
										System.out.println("row insertion failed!");
									} else {
										System.out.println("row insertion successfull!");
									}
								} 
							}
			} catch (ClassNotFoundException e) {
				System.out.println("Exception occured due to :: "+e.getMessage());
			} catch (SQLException e) {
				System.out.println("sqlexception:: "+e.getMessage());
			} catch (FileNotFoundException e1) {
				System.out.println(e1.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
			finally {
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

