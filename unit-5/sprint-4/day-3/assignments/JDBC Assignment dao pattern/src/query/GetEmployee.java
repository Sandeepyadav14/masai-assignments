package query;

import java.util.Scanner;

import dao.Querydao;
import dao.Querydaoimpl;
import bean.Employee3;

public class GetEmployee {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Employee ID:");
	 int id=sc.nextInt();
	 Querydao qd=new Querydaoimpl();
	 Employee3 student= qd.SearchEmploye3(id);
	 if(student!=null){
		 System.out.println(student);
	 }
 }
}
