package query;

import java.util.Scanner;

import dao.Querydao;
import dao.Querydaoimpl;

public class DetailAdd {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter id:");
	 int id=sc.nextInt();
	 System.out.println("Enter Name:");
	 String name=sc.next();
	 System.out.println("Enter Salary");
	 int salary=sc.nextInt();
	 
	 Querydao qd=new Querydaoimpl();
	 String result =qd.InsertEmployeeDetailwithoutaddress(id, name, salary);
	 System.out.print(result);
 }
}
