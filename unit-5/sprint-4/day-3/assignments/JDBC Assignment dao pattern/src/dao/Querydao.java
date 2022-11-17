package dao;

import java.util.List;

import bean.Employee3;

public interface Querydao {
	public int GetSalaryById (int id);
	public List<Employee3> GetEmployeeDetail();
	public int ProvideAllBonus ();
	public String InsertEmployeeDetailwithoutaddress(int id,String name,int salary);
	public Employee3 SearchEmploye3(int id);
	public List<Employee3> Employee3lessthanSalary();
	
	

}
