package query;

import java.util.Scanner;

import dao.Querydao;
import dao.Querydaoimpl;

public class GetSalaryById {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the employee id:");
		int id=sc.nextInt();
		Querydao qd=new Querydaoimpl();
		int result=qd.GetSalaryById(id);
		if(result>0) {
			System.out.println(result);
		}
	}

}
