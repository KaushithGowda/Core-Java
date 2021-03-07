package com.practise.jdbc10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class StatementSQLInjectionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				//Resources used
				FileInputStream fileInputStream = null;
				Scanner scanner = null;
				Connection connection = null;
				Statement statement = null;
				ResultSet resultSet = null;
				
				//login credentials
				String uname = null;
				String upassword = null;
				
				
				// took file name from command line
				String fileName= "F:\\Code\\Java\\PractiseAdvance\\src\\com\\practise\\resources\\" + args[0];
				
				try {
					
					scanner = new Scanner(System.in);
					
					System.out.print("enter the uname:: ");
					uname = scanner.next();
					
					System.out.print("enter the password:: ");
					upassword = scanner.next();
					
				    //get the information from the filename to java code
					fileInputStream = new FileInputStream(fileName);
					
					//creating object of Properties file to get the data
					Properties properties = new Properties();
					
					//loading of properties using fileIputStream
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
						
						//step.3 creating statement object
						statement = connection.createStatement();
						
							if(statement != null) {
							
								String sqlSelectQuery = "select count(*) from advday10login where uname = '"+uname+" and upassword = "+upassword+"'";
								System.out.println(sqlSelectQuery);
								//SQL injection is supported by Statement object
								
								//step.4 executing the query
								resultSet = statement.executeQuery(sqlSelectQuery);
								
								if(resultSet != null) {
									
									if(resultSet.next() != false) {
									//step.5 retriving the data
										int rowCount = resultSet.getInt(1);
										if (rowCount == 0) {
											System.out.println("username and password incorrect");
										} else {
											System.out.println("login successfull!");
										}
									} 
								}
								else {
									System.out.println("no records presentin dB");
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
				}
				finally {
						if (resultSet != null) {
							try {
								resultSet.close();
							} catch (Exception e) {
								e.getMessage();
							}
						}
						if (statement != null) {
							try {
								statement.close();
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
