package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Bean.Employee;
import Connection.Main;

public class Employeedaoimpl implements Employeedao {

	@Override
	public String InsertDetailOfEmployee(Employee e) {
		String message="Data not Inserted...";
		
		try(Connection conn=Main.GetConnection()){
			PreparedStatement ps=conn.prepareStatement("insert into employee values(?,?,?,?,?)");
			 
			ps.setInt(1, e.getEmpid());
			ps.setString(2, e.getEname());
			ps.setString(3, e.getAddress());
			ps.setString(4, e.getMobile());
			ps.setInt(5, e.getDeptid());
			
			
			int x=ps.executeUpdate();
			if(x>0) {
				message="insert done......";
			}
		
			
		} catch (SQLException s) {
			// TODO Auto-generated catch block
			s.printStackTrace();
		}
		return message;
	}

	@Override
	public List<Employee> EmployeeWorkInAccount() {
      
		List<Employee> list=new ArrayList();
		Employee e=null;
		
		try(Connection conn=Main.GetConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from employee INNER JOIN department where deptid=did AND dname='Account'");
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				int id=rs.getInt("empid");
				String name=rs.getString("ename");
				String address=rs.getString("Address");
				String mobile=rs.getString("mobile");
				int deptid=rs.getInt("deptid");
				e=new Employee(id,name,address,mobile,deptid);
				list.add(e);
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return list;
	}
	
	

}
