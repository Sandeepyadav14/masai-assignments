package query;

import java. util.List;

import bean.Employee3;
import dao.Querydao;
import dao.Querydaoimpl;

public class GetEmployeeDetails {
public static void main(String[] args) {
    Querydao qd=new Querydaoimpl();
    List<Employee3> list=qd.GetEmployeeDetail();
    list.forEach(s-> System.out.println(s));
    
}
}
