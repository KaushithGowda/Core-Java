package com.practise.jdbc9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class PreparedStatementMainApp {

	private static String SQLInsertQuery = "insert into student values(?,?,?)";
	
	public static void main(String[] args) {

		//Resources opened
		FileInputStream fileInputStream = null;
		Properties properties = null;
		Scanner scanner = null;
		Connection connection = null;
		PreparedStatement preparedStatement= null;
			
		//local resources
		int sid = 0;
		String sname = null;
		int sage = 0;
		
			//properties file location
			String fileName="F:\\Code\\Java\\PractiseAdvance\\src\\com\\practise\\resources\\"+args[0];
			
			 try {
				
				 scanner = new Scanner(System.in);
						 
					 if(scanner != null) {
						 
						 System.out.print("enter the sid:: ");
						 sid = scanner.nextInt();

						 System.out.print("enter the sname:: ");
						 sname = scanner.next();
						 
						 System.out.print("enter the sage:: ");
						 sage = scanner.nextInt();
					 }
					 
					 //creating fileInputStream channel
					 fileInputStream = new FileInputStream(fileName);
					 
					 //creating properties object
					 properties = new Properties();
					 //loading fileInputStream
					 properties.load(fileInputStream);
					 
					 //getting property from properties file
					 String url=properties.getProperty("jdbc.url");
					 String username=properties.getProperty("jdbc.username");
					 String password=properties.getProperty("jdbc.password");
					 
					 System.out.println("Url pattern:: "+url);
					 System.out.println("User name:: "+username);
					 System.out.println("Passsword:: "+password);
				 
				 //making connection btw java app and db
				 connection = DriverManager.getConnection(url,username,password);
				 System.out.println("Connected to db!");
				
				 if (connection != null) {
					 
				 //creating preparedStatement object
				 preparedStatement = connection.prepareStatement(SQLInsertQuery);

				 if (preparedStatement != null) {
					 
					 //setting values to placeholder
					 preparedStatement.setInt(1, sid);
					 preparedStatement.setString(2, sname);
					 preparedStatement.setInt(3, sage);
					 
					 //executing the query
					 int rowAffected = preparedStatement.executeUpdate();
					  
					 if (rowAffected == 0) {
						 System.out.println("Insertion failed!");
					} else {
						System.out.println("No of rows Inserted:: "+rowAffected);
					}
				 }
				}
			 }catch(FileNotFoundException e) { //propertiesfile
				 e.printStackTrace();
			 } catch (IOException e) { //fileInputStream
				e.printStackTrace();
			} catch (SQLException e) { //connection
				e.printStackTrace();
			}
			 finally {
				 //closing resources
				 //automatically closed by the try block
			 }
			
	}
}

