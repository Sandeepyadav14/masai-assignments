import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;
public class Demo{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The product ID:");
		int id=s.nextInt();
		System.out.println("Enter The product Name:");
		String name=s.next();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/sandydatabase";
		try {
			Connection conn=DriverManager.getConnection(url,"root","1414");
			PreparedStatement ps= conn.prepareStatement("insert into product(pid,pname) values(?,?);");
			ps.setInt(1, id);
			ps.setString(2, name);
			
			
			int x=ps.executeUpdate();
			if(x>0) {
				System.out.println("Data Save");
				
			}else {
				System.out.println("Data Not Save");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
