package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Bean.Department;
import Bean.Employee;
import Connection.Main;

public class Departmentdaoimpl implements Departmentdao {

	@Override
	public String InsertDetailOfDepartment(Department d) {
		
		String msg="data not inserted...";
		try(Connection conn=Main.GetConnection()){
			PreparedStatement ps=conn.prepareStatement("insert into department values(?,?,?)");
			ps.setInt(1, d.getDid());
			ps.setString(2, d.getDname());
			ps.setString(3,d.getLocation());
			int x=ps.executeUpdate();
			if(x>0){
				msg="data inserted...";
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public String DeleteDepartmentByDid(int did) {
		String msg="Not deleted";
		
		try(Connection conn=Main.GetConnection()){
			PreparedStatement ps=conn.prepareStatement("delete from ")
		}
	}

	@Override
	public List<Department> GetdepartmentDetailOfMumbai() {
		List<Department> list=new ArrayList();
		Department d=null;
		try(Connection conn=Main.GetConnection()){
		PreparedStatement ps=conn.prepareStatement(" select did,dname,location from department inner join employee where did=deptid AND address='mumbai'");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			int did=rs.getInt("did");
		    String name =rs.getString("dname");
		    String location =rs.getString("location");
		    d=new Department(did,name,location);
		    list.add(d);
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}

}
