package com.practise.trickyQuestions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class StatementExecuteQuery {

	public static void main(String[] args) {

		// resources used
		FileInputStream fileInputStream = null;
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		
		// fileName adddress
		String fileName= "F:\\Code\\Java\\PractiseAdvance\\src\\com\\practise\\resources\\"+args[0];
		
		try {
			// creating fileInputStream object
			fileInputStream = new FileInputStream(fileName);

			// creating properties object
			Properties properties = new Properties();
			
			// loading properties of the dB
			properties.load(fileInputStream);
			
			// getting the properties of dB
			String url = properties.getProperty("jdbc.url");
			String username = properties.getProperty("jdbc.username");
			String password = properties.getProperty("jdbc.password");
			
			System.out.println("url in properties file:: "+url);
			System.out.println("username in properties file:: "+username);
			System.out.println("password in properties file:: "+password);
			
			// step.1 load and registering the driver 
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("db loaded and registered!");
			
			// step.2 establishing the connection between java and database
			connection = DriverManager.getConnection(url,username,password);
			System.out.println("connection established to dB!");

			if(connection != null) {
			
				// step.3 creating statement object
				statement = connection.createStatement();
			
				if(statement != null) {
				
					// query
					String sqlNonSelectQuery = "insert into student values(19,'rahul dravid',48)";
						
						
					/* step.4 
					  statement.executeQuery retuns object(result of dbe query execution)
					  statement.executeUpdate returns int(no of rows executed)
					  executing the query
					  for insert,delete,update(dml::data manupulation language)
					  using statement.executeQuery() instead of using statement.executeUpdate()
					  mySQL dB :: results in java.sql.SQLException 
					  Oracle dB :: results in execution of query and we can get information of 
					  rows affected using statement.getUpdateCount() */
					resultSet = statement.executeQuery(sqlNonSelectQuery);
						if (resultSet != null) {
							
							System.out.println("query executed successfully!");
						}
				}
			} else {
				System.out.println("no records found in dB");
			}
		} catch (ClassNotFoundException e) {
				System.out.println(e.getMessage());
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException:: "+e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException:: "+e.getMessage());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
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
	

