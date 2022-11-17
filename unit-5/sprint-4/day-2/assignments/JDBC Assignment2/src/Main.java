import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;
public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The product ID:");
		int id=s.nextInt();
		System.out.println("Enter The product Name:");
		String name=s.next();
		System.out.println("Enter The product Quantity:");
		int quantity=s.nextInt();
		System.out.println("Enter The product Price:");
		int price=s.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/sandydatabase";
		try {
			Connection conn=DriverManager.getConnection(url,"root","1414");
			PreparedStatement ps= conn.prepareStatement("insert into product values(?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3,quantity);
			ps.setInt(4, price);
			
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
