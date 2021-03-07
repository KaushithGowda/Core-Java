package com.practise.jdbc9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class PreparedStatementStaticInputs {

	private static String SQLInsertQuery = "insert into student values(14,'pandya',29)";

	public static void main(String[] args) {
		
			//Resources opened
			FileInputStream fileInputStream = null;
			Properties properties = null;
			Connection connection = null;
			PreparedStatement preparedStatement= null;
				
				//properties file location
				String fileName="F:\\Code\\Java\\PractiseAdvance\\src\\com\\practise\\resources\\"+args[0];
				
				 try {
					
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
