package com.practise.jdbc4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*performing retrival operation from db(select)*/

public class MainApp {

	public static void main(String[] args) {

		// resources used
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		//urlpattern::"protocolName:subprotocolName:<ipaddress_db_Machine>:<port_no>/<dbName>"
		String url="jdbc:mysql://localhost:3306/abc";
		String user="root";
		String password="abc123";
		
	  try {
			//step.1 loading and registering the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Database loaded and locked--->");
			
			//step.2 establishing the connection between java application and database(mysql)
			connection  = DriverManager.getConnection(url,user,password);
			
			if(connection != null) {
				System.out.println("Connected to database successfully...!");
			
				//step.3 create the statement object to perform query operation
				statement = connection.createStatement();		
				
				if (statement != null) {
					String sqlQuery="select * from student";
					
					//step.4 executing the query as per requirement
					resultSet = statement.executeQuery(sqlQuery);
					
				      if(resultSet != null) {
					          
					            	 	//step.5 perform retrival operation on the data retrieved from the db
					            	 	System.out.println("SID\t NAME\t AGE\t MAIL\t");
					            	 	
					            	 	//while loop is used because we don't know termination condition in db(don't know no of records in db)
					            	 	while(resultSet.next() != false) {
					            	 	
					            	 		//retriving using index value
					            	 		int sid = resultSet.getInt(1);
					            	 		String name = resultSet.getString(2);
					            	 		int age = resultSet.getInt(3);
					            	 		String mail = resultSet.getString(4);
					            	 		
					            	 		System.out.println(sid + "\t" + name + "\t" + age + "\t" + mail);
					            	 	}
				                 } else {
					            	 System.out.println("sorry no records in the db to display!!!");
					             }
					             System.out.println("Connection implementation class names: " + connection.getClass().getName());
					             System.out.println("Statement implementation class names: " + statement.getClass().getName());
					             System.out.println("ResultSet implementation class names: " + resultSet.getClass().getName());
				        }
		          }
		} catch (ClassNotFoundException e) {
                System.out.println("the cause of exception:: " +e.getMessage());			
		} catch (SQLException e) {
			System.out.println("the cause of exception:: " +e.getMessage());			
		} finally {
			
			//step.6 resources closed
			try {
			 	  if(resultSet != null) {
					statement.close();
				  }
			} catch (SQLException sqlException) {
				System.out.println("the cause of exception:: " +sqlException.getMessage());			
		    }
			try {
				  if(statement != null) {
					statement.close();
				}
			} catch (SQLException sqlException) {
				System.out.println("the cause of exception:: " +sqlException.getMessage());			
		    }
		    try {
			     if(connection != null) {
					connection.close();
				} 
		    } catch (SQLException sqlException) {
			System.out.println("the cause of exception:: " +sqlException.getMessage());			
	        }	
		} 
	}
	
 }
	

