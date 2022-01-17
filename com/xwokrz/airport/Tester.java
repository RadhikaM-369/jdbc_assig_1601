package com.xwokrz.airport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Tester {

	static String url="jdbc:mysql://localhost:3306/jdbc";
	static String userName="root";
	static String password="SQL123456789";
	
	static String sqlStatement="insert into jdbc.Airport values(1,'Belgaum Airport','Sambra Belgaum','belagum','Hyderabad,delhi',1,false)";
	static String sqlStatement1="insert into jdbc.Airport values(2, 'Kolhapur Airport','Kolhapur','Kolhapur','Mumbai,tirupati',1,false)";
	static String sqlStatement2="insert into jdbc.Airport values(3,'Kempegouda International Airport','Bengaluru','Bengaluru','dubai,Kuwait',1,true)";
	static String sqlStatement3="insert into jdbc.Airport values(4,'CSM International Airport','mumbai','mumbai','AbuDhabi,PortBlair',2,true)";
	static String sqlStatement4="insert into jdbc.Airport values(5,'Hyderabad International Airport','Shamshabad, Hyderabad','Hyderabad','Chicago,damman',1,true)";
	
	static String updateStatement="update jdbc.Airport set Airport_name='HAL Bangalore' where Id=3";
	
	static String deleteStatement="delete from jdbc.Airport where Id=3";
	
	public static void main(String[] args) throws Exception {
		Connection connection=null;
		
		 try {
			 connection=DriverManager.getConnection(url, userName, password);	
			 System.out.println(connection+url);
			 
			 Statement statement=connection.createStatement(); 
			
			 // statement.executeUpdate(sqlStatement);
			 //statement.executeUpdate(sqlStatement1);
			// statement.executeUpdate(sqlStatement2);
			// statement.executeUpdate(sqlStatement3);
			// statement.executeUpdate(sqlStatement4);
			 
			// statement.executeUpdate(updateStatement);
			 statement.executeUpdate(deleteStatement);
			 
			 System.out.println("Query executed");
		 }
		 
	catch(SQLException e) {
		System.out.println("Query is not executed"+e.getMessage());
	}
		 
	finally {
		try {
				if(connection!=null) {
				connection.close();
			}	else {
				System.out.println("Connection is not created");
			}	}
		catch(SQLException e) {
			
		}
	
}
}
}
