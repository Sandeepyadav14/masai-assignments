package usecases;
import java.util.Scanner;


import dao.ProductDao;
import dao.Productimpl;
import exception.ProductException;
import modules.Product;

public class AddProduct {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Product id :");
        int id= sc.nextInt();

        System.out.println("Enter Product Name :");
        String name= sc.next();

        System.out.println("Enter Product Price :");
        int price= sc.nextInt();

        System.out.println("Enter Product quantity :");
        int quantity= sc.nextInt();


        Product product= new Product();
        product.setProductid(id);
        product.setProductname(name);
        product.setPrice(price);
        product.setQuantity(quantity);

        ProductDao dao = new Productimpl();

        try {
            String result= dao.addProduct(product);

            System.out.println(result);


        }catch (ProductException e) {
            System.out.println(e.getMessage());
        }
    }

}
