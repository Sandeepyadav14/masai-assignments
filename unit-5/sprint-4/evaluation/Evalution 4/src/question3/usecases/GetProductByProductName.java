package usecases;

import java.util.Scanner;

import dao.Productimpl;
import exception.ProductException;
import modules.Product;

public class GetProductByProductName {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Name :");
	String name= sc.next();

    Productimpl dao = new Productimpl();
	
	try {
		Product product=dao.getProductByProductName(name);
		System.out.print(product);
	} catch (ProductException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}
