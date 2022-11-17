package Dao;

import java.util.List;

import Bean.Department;
import Bean.Employee;

public interface Departmentdao {
	public String InsertDetailOfDepartment(Department d);
	public String DeleteDepartmentByDid(int did);
	public List<Department> GetdepartmentDetailOfMumbai();

}
