package Usecase;

import java. util.List;

import Bean.Employee;
import Dao.Employeedao;
import Dao.Employeedaoimpl;

public class GetEmployeeDetailByDname {
	public static void main(String[] args) {

		
		Employeedao ed=new Employeedaoimpl();
	List<Employee> list=ed.EmployeeWorkInAccount();
	if(list!=null) {
		list.forEach(s->System.out.println(s));
	}
	
		
				
	}

}
