package usecases;

import java.util.Scanner;

import dao.ProductDao;
import dao.Productimpl;
import exception.ProductException;
import modules.Product;

public class DeleteProduct {
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        
        System.out.println("Enter Product Name :");
        String name= sc.next();

      

        ProductDao dao = new Productimpl();

        try {
            String result= dao.deleteProductByProductName(name);

            System.out.println(result);


        }catch (ProductException e) {
            System.out.println(e.getMessage());
        }
    }


}
