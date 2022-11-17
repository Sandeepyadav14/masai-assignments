package dao;

import exception.ProductException;
import modules.Product;
import util.Util;
//import exception.ProdcutException;
//import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Productimpl implements ProductDao {

    @Override
    public String addProduct(Product product) throws ProductException {

        String message="Not Add...";
      try(Connection conn= Util.ProvideConnection()){
          PreparedStatement ps=conn.prepareStatement("insert into Product values (?,?,?,?);");
          ps.setInt(1,product.getProductid());
          ps.setString(2,product.getProductname());
          ps.setInt(3,product.getPrice());
          ps.setInt(4,product.getQuantity());
          int x=ps.executeUpdate();
          if(x>0){
              message="Product deatail is added";

          }

      }
     catch (SQLException e) {
        e.printStackTrace();
        throw new ProductException(e.getMessage());
    }
      return message;
    }

	@Override
	public List<Product> getAllProducts() throws ProductException {
		
		List<Product> product=new ArrayList<>();
		Product product1=null;
		try(Connection conn= Util.ProvideConnection()){
	          PreparedStatement ps=conn.prepareStatement("select * from product");
	          ResultSet rs =ps.executeQuery();
	          while(rs.next()) {
	          int id=rs.getInt("Productid");
	          String name=rs.getString("productName");
	          int price=rs.getInt("price");
	          int quantity=rs.getInt("quantity");
	          product1=new Product(id,name,price,quantity);
	          product.add(product1);
	          }
	          
		}catch(SQLException e) {
			throw new ProductException(e.getMessage());
		}
	          if(product.size()==0) {
	        	  throw new ProductException("product is not found");
	          }
	          return product;
			}

	@Override
	public List<Product> getAllProductQuantityLessThan(int quantity) throws ProductException {
		List<Product> product=new ArrayList<>();
		Product product1=null;
		try(Connection conn= Util.ProvideConnection()){
	         
		PreparedStatement ps=conn.prepareStatement("select * from product where quantity<?");
		ps.setInt(1, quantity);
		
		ResultSet rs =ps.executeQuery();
	          while(rs.next()) {
	        	 
	          int id=rs.getInt("Productid");
	          String name=rs.getString("productName");
	          int price=rs.getInt("price");
	          int quantity1=rs.getInt("quantity");
	         
	          product1=new Product(id,name,price,quantity1);
	          product.add(product1);
	          }
	          
		}catch(SQLException e) {
			throw new ProductException(e.getMessage());
		}
	          if(product.size()==0) {
	        	  throw new ProductException("product is not found");
	          }
	          return product;	}
	
	public String addProductQuantity(int productId, int Quantity)throws ProductException {
		  String message="Not Add...";
	      try(Connection conn= Util.ProvideConnection()){
	          PreparedStatement ps=conn.prepareStatement("insert into Product (productId,Quantity) values (?,?);");
	          ps.setInt(1, productId);
				ps.setInt(2, Quantity);
				
				
				int x=ps.executeUpdate();
				if(x>0) {
					System.out.println("ID and Quantity is saved ");
					
				}else {
					System.out.println("Not Saved");
				}
				
	      }
	     catch (SQLException e) {
	        e.printStackTrace();
	        throw new ProductException(e.getMessage());
	    }
	      return message;
		
	}

	@Override
	public String deleteProductByProductName(String pname) throws ProductException {
		  String message="Not deleted...";
	      try(Connection conn= Util.ProvideConnection()){
	          PreparedStatement ps=conn.prepareStatement("delete from product where productName=?");
	          ps.setString(1, pname);
	          int x= ps.executeUpdate();
	           System.out.print(x);
	          if(x>0){
	              message=x+"Product deatail is deleted";

	          }

	      }
	     catch (SQLException e) {
	        e.printStackTrace();
	        throw new ProductException(e.getMessage());
	    }
	      return message;
	    }
		public Product getProductByProductName(String pname) throws ProductException {
         Product product= null;
		
		try(Connection conn= Util.ProvideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select * from product where productName = ?");
			
			ps.setString(1, pname);
			
             ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {

				int r = rs.getInt("productid");
				String n = rs.getString("productName");
				int m = rs.getInt("price");
				int s=rs.getInt("quantity");


				product = new Product(r, n, m,s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return product;
	}
		
	

}
