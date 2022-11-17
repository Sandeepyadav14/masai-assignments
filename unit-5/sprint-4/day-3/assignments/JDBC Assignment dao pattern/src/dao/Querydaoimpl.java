package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import Connection.Main;
import bean.Employee3;

public class Querydaoimpl implements Querydao {

	@Override
	public int GetSalaryById(int id) {
		
		int salary =-1;
		try(Connection conn=Main.GetConnection()){
			PreparedStatement ps=conn.prepareStatement("select salary from employee3 where eid=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				salary=rs.getInt("salary");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return salary;
		
	}

	@Override
	public List<Employee3> GetEmployeeDetail() {
		
		List<Employee3> list=new ArrayList();
		Employee3 e=null;
		
		try(Connection conn=Main.GetConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from employee3");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int id=rs.getInt("eid");
				String name=rs.getString("name");
				String address=rs.getString("address");
				int salary=rs.getInt("salary");
				e=new Employee3(id,name,address,salary);
				list.add(e);
							}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return list;
		
		
	}
	

	@Override
	public int ProvideAllBonus() {
		int bonus=-1;
		try(Connection conn=Main.GetConnection()){
				PreparedStatement ps=conn.prepareStatement("update employee3 set salary =salary+500");
				bonus=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bonus;
	}

	@Override
	public String InsertEmployeeDetailwithoutaddress(int id, String name, int salary) {
		String message="Not Inserted....";
		try(Connection conn=Main.GetConnection()){
			PreparedStatement ps=conn.prepareStatement("insert into employee3 (eid,name,salary) values(?,?,?)");
		  ps.setInt(1,id);
		  ps.setString(2,name);
		  ps.setInt(3,salary);
		  int x=ps.executeUpdate();
		  if(x>0) {
			  message="done";
		  }
		  } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return message;

	}

	@Override
	public Employee3 SearchEmploye3(int id) {
		Employee3 el=null;
		try(Connection conn=Main.GetConnection()){
				PreparedStatement ps=conn.prepareStatement("select * from employee3 where eid=?");
				ps.setInt(1, id);
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					int i=rs.getInt("eid");
					String name=rs.getString("name");
					String add=rs.getString("address");
					int salary =rs.getInt("salary");
					el=new Employee3(i,name,add,salary);
					
				}
					
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return el;
		}
	
	
	public List<Employee3> Employee3lessthanSalary(){
		
		List<Employee3> list=new ArrayList();
		Employee3 el=null;
		try(Connection conn=Main.GetConnection()){
			PreparedStatement ps=conn.prepareStatement("select * from employee3 where salary<500");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int i=rs.getInt("eid");
				String name=rs.getString("name");
				String address =rs.getString("address");
				int salary=rs.getInt("salary");
				el=new Employee3(i,name,address,salary);
				list.add(el);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	
	
	}

	
	 

