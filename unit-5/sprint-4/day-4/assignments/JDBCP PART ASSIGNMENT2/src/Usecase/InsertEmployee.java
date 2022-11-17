package Usecase;

import java.util.Scanner;

import Bean.Employee;
import Dao.Employeedao;
import Dao.Employeedaoimpl;

public class InsertEmployee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Employee Id");
		int eid=sc.nextInt();
		
		System.out.println("Enter the Employee name");
		String ename=sc.next();
		
		System.out.println("Enter the Employee Address");
		String address=sc.next();
		
		System.out.println("Enter the Employee Mobile");
		String mobile =sc.next();
		
		System.out.println("Enter the Departement Id");
		int depid=sc.nextInt();
		
		Employeedao ed=new Employeedaoimpl();
		
		Employee e=new Employee(eid,ename,address,mobile,depid);
//		e.setEmpid(eid);
//		e.setEname(ename);
//		e.setAddress(address);
//		e.setMobile(mobile);
//		e.setDeptid(depid);
		String msg=ed.InsertDetailOfEmployee(e);
		System.out.println(msg);
	}

}
