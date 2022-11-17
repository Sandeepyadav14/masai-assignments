package Usecase;

import java.util.Scanner;

import Bean.Department;
import Dao.Departmentdao;
import Dao.Departmentdaoimpl;

public class InsertDepartmentDetails {
	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Department Id");
		int did=sc.nextInt();
		
		System.out.println("Enter the Department name");
		String dname=sc.next();
		
		System.out.println("Enter the Department location");
		String location=sc.next();
		
		
		
		Departmentdao dd=new Departmentdaoimpl();
		Department d=new Department(did,dname,location);
		String r= dd.InsertDetailOfDepartment(d);
		System.out.println(r);
		
	}

}
