package com.practise.jdbc5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*types of retriving data from db-->line.54*/

public class MainApp {

	public static void main(String[] args) {

		// resources used
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		//urlpattern::"protocolName:subprotocolName:<ipaddress_db_Machine>:<port_no>/<dbName>"
		String url="jdbc:mysql://localhost:3306/day6";
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
					String sqlQuery="select * from student where sid=10";
					
					//step.4 executing the query as per requirement
					resultSet = statement.executeQuery(sqlQuery);
					
				      if(resultSet != null) {
					          
					            	 	//step.5 perform retrival operation on the data retrieved from the db
					            	 	System.out.println("SID\t SNAME\t SAGE\t ");
					            	 	//if-else logic is used because we knew db has only one record
					            	 	if(resultSet.next() != false) {
					            	 		
					            	 		//3 ways of retriving data from db 

					            	 		//1.retriving using name of the column
					            	 		int sid = resultSet.getInt("sid");
					            	 		String sname = resultSet.getString("sname");
					            	 		int sage = resultSet.getInt("sage");
					            	 		
					            	 		/*2.retriving using captial words(db is not case sensitive)
					            	 		int sid = resultSet.getInt("SID");
					            	 		String sname = resultSet.getString("SNAME");
					            	 		int sage = resultSet.getInt("SAGE");*/
					            	 		
					            	 		/*3.retriving all data-types as string
					            	 		String sid = resultSet.getString("SID");
					            	 		String sname = resultSet.getString("SNAME");
					            	 		String sage = resultSet.getString("SAGE");*/
					            	 		
					            	 		System.out.println(sid + "\t" + sname + "\t" + sage);
					            	 	} else {
							            	 System.out.println("sorry no records in the db to display!!!");
				                        } 
					             }
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
	

