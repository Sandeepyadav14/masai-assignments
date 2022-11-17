import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the product id which product value you update:");
		int id=s.nextInt();
		System.out.println("Enter the update quantity value:");
		int quantity=s.nextInt();

		System.out.println("Enter the update price value:");
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
				PreparedStatement ps=conn.prepareStatement("update product set quantity=?,price=? where pid=?");
				ps.setInt(1,quantity);
				ps.setInt(2, price);
				ps.setInt(3, id);
				int x=ps.executeUpdate();	
				if(x>0) {
					System.out.print("done");
				}else {
					System.out.println("No");
				}
			} catch (SQLException e) {
		
				e.printStackTrace();
			}
			
			
	   
		
	}

}
