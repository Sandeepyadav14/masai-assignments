package usecases;

import java.util.List;
import java.util.Scanner;

import dao.ProductDao;
import dao.Productimpl;
import exception.ProductException;
import modules.Product;

public class GetProductLessThanQuantity {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Quantity :");
		int quantity= sc.nextInt();

		ProductDao dao = new Productimpl();
		
		try {
			List<Product> product=dao.getAllProductQuantityLessThan(quantity);
			product.forEach(s -> System.out.println(s));
		}catch(ProductException e) {
			 System.out.print(e.getMessage());
		}
}


}
