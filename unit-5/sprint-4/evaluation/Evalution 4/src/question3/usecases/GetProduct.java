package usecases;

import java.util.List;

import dao.ProductDao;
import dao.Productimpl;
import exception.ProductException;
import modules.Product;

public class GetProduct {

	public static void main(String[] args) throws ProductException {
		
		ProductDao dao=new Productimpl();
		try {
		List<Product> product=dao.getAllProducts();
		product.forEach(s -> System.out.println(s));
	}catch(ProductException e) {
		 System.out.print(e.getMessage());
	}
	}
}
