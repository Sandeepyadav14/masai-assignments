package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	public static Connection GetConnection() {
		
		 Connection conn=null;
		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	   String url="jdbc:mysql://localhost:3306/db3";
	   
	   
	   
	   try {
	        conn=DriverManager.getConnection(url,"root","1414");
	       
	   }catch(SQLException e) {
		   e.printStackTrace();
	   }
	   return conn;
		
	}

}
