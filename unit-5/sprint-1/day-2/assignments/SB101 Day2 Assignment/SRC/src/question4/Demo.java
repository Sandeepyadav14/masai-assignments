package question4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Product> products=new  ArrayList<>();
        products.add(new Product(1,"nike",5,7600));
        products.add(new Product(4,"Paragon",3,4500));
        products.add(new Product(9,"Lux",8,8000));
        products.add(new Product(2,"AmulMacho",4,3500));
        products.add(new Product(7,"Zara",9,8900));

//        Lambda Expression*

        Collections.sort(products,(s1,s2)->{

            if (s1.getPrice() > s2.getPrice()) {

                return 1;
            }
            else{
                return -1;
            }
        });
        for(Product i:products){
            System.out.println(i);
        }


    }
}
