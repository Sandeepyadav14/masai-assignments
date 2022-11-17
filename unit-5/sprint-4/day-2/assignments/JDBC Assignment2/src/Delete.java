import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
  public static void main(String[] args) {
	 
	  try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//	  String url="jdbc:mysql://localhost:3306//sandydatabase";
	  String url="jdbc:mysql://localhost:3306/sandydatabase";
	  try {
		Connection conn=DriverManager.getConnection(url,"root","1414");
		Statement st= conn.createStatement();
		int x=st.executeUpdate("delete from product where quantity<2");
		if(x>0) {
			System.out.println("done.");
			
		}else {
			System.out.print("something Wrong.");
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
}
