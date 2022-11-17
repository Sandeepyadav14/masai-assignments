package Usecase;

import java.util.List;

import Bean.Department;
import Dao.Departmentdao;
import Dao.Departmentdaoimpl;

public class GetDepartmentByMumbai {
	public static void main(String[] args) {
		Departmentdao dd=new Departmentdaoimpl();
		List<Department> list=dd.GetdepartmentDetailOfMumbai();
		if(list.size()==0) {
			System.out.print("Data is not found...");
		}
		else {
			list.forEach(s->System.out.println(s));

		}
			}

}
