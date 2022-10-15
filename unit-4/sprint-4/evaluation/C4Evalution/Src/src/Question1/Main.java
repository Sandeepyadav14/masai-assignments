package Question1;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please Enter How Many Object You Want Enter:");
        int n=s.nextInt();
        Product arr[]=new Product[n];
        for(int i=0;i<n;i++){
          Product product=new Product();
            System.out.println("Please Enter Product Name:");
            product.productName=s.next();
            System.out.println("Please Enter Product Price ");
            product.productPrice=s.nextDouble();
            arr[i]=product;
        }
        Set<Product> productSet=new TreeSet<>();
        for(int i=0;i<n;i++){
            productSet.add(arr[i]);
        }
        System.out.println(productSet);
    }
}
