package usecases;

import java.util.Scanner;

import dao.ProductDao;
import dao.Productimpl;
import exception.ProductException;

public class AddIdQuantity {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The product ID:");
		int id=s.nextInt();
		System.out.println("Enter The product Quantity:");
		int  quantity=s.nextInt();
		ProductDao dao=new Productimpl();
		try {
			String result=dao.addProductQuantity(id, quantity);
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
}