package com.qa.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectionDemo {

	public static void main(String[] args) throws SQLException {
		
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
		
	     Statement st=con.createStatement();
	     String s="select *from Employees";
	    ResultSet rs= st.executeQuery(s); 
	    
	    while(rs.next())
	    {
	    	System.out.println((rs.getInt("employee_id"))+"   "+(rs.getString("first_name")));
	    	//System.out.println(rs.getString("first_name"));
	    
	    }
	     con.close();
	}
	
}
