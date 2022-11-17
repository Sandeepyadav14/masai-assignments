package query;

import java.util.List;

import dao.Querydao;
import dao.Querydaoimpl;
import bean.Employee3;

public class LessThanSalaryGetEmplData {
	public static void main(String[] args) {
		Querydao qd=new Querydaoimpl();
		List<Employee3> list=qd.Employee3lessthanSalary();
		list.forEach(s->System.out.println(s));
		
	}

}
