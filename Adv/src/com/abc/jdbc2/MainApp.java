//package com.abc.jdbc2;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class MainApp {
//
//	public static void main(String[] args) {
//
//		//Resources
//		Connection connection = null;
//		Statement statement = null;
//		ResultSet resultSet = null;
//		
//		//UrlPattern:"protocolName:subprotocolName:<ipaddress_db_Machine>:<port_no>:<dbName>"
//		String url = "jdbc:mysql://localhost:3306/e_commerce";
//		String user = "root";
//		String password = "9986830462#K";
//		
//		try {
//		//step1.loading and registering the driver
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		System.out.println("Loading the driver");
//		
//		//step2.establishing the connection b/w java application and database(MySQL)
//		connection = DriverManager.getConnection(url, user, password);
//		
//		if(connection != null)
//		{
//			System.out.println("connected to database successfully");
//			//step3.create a statement object as per the user needs
//			statement = connection.createStatement();
//		}
//		
//		if(statement != null) {
//			String sqlQueery = "select * from Student";
//			
//			//step4. execute the query as per the requirement
//			resultSet = statement.executeQuery(sqlQueery);
//		}
//		}catch (SQLException e) {
//			System.out.println("the cause of the exception is :: "+ e.getMessage());
//		}finally {
//			    try()
//			    {
//				    if(resultSet != null)
//				    {
//					resultSet.close();
//				    }
//				}
//				catch (SQLException e) {
//					System.out.println("the cause of the exception is :: "+ e.getMessage());
//				}
//				if(statement != null)
//				{
//					statement.close();
//				}
//				atch (SQLException e) {
//					System.out.println("the cause of the exception is :: "+ e.getMessage());
//				}
//				else(connection != null)
//				{
//					connection.close();
//				}
//			}
//			catch(Exception e)
//			{
//				System.out.println("the cause of the exception is :: "+ e.getMessage());
//			}
//		}
//		
//	}
//	
//}
//
//
