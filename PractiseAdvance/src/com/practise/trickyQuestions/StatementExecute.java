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

public class StatementExecute {

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
					String sqlQuery = "delete from student where sid=19";
						
						
					/* step.4 
					 * 
					 * statement.execute(sqlQuery) returns boolean
					 * true:: drl query
					 * false:: dml query
					 * So execute method can be used as main method to execute both excuteUpdate and excuteQuery
					 * using if else logic btw them
					 * dml query should be handle with if-else logic depednding the return result
					 * 
					 * */
					boolean flag = statement.execute(sqlQuery);
					System.out.println(flag);
							if (flag == true) {
									System.out.println("drl query executing");
								
									resultSet = statement.getResultSet();

									System.out.println("SID\t\tSNAME\t\tSAGE");
									while (resultSet.next() != false) {
										System.out.println(resultSet.getInt(1)+"\t"+"\t"+resultSet.getString(2)+"\t"+"\t"+resultSet.getInt(3));
									}
							} else {
							    	System.out.println("dml query executing");
							    	int rowAffected = statement.getUpdateCount();
							    		if (rowAffected == 0) {
							    			System.out.println("row updation failed:: "+ rowAffected);
							    		} else {
							    			System.out.println("row updated:: "+ rowAffected);
							    		}
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
