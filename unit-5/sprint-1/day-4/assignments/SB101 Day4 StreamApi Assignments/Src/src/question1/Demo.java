package question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "nike", 213, 3));
        products.add(new Product(6, "zara", 873, 12));
        products.add(new Product(5, "shoes", 673, 2));
        products.add(new Product(9, "bata", 264, 23));
        products.add(new Product(3, "paragon", 413, 11));

        Stream<Product> newproduct = products.stream();
        Stream<Product> newproduct2 = newproduct.filter(s -> s.getQuantity() > 10);
        System.out.println(newproduct2);
        List<Product> newlist = newproduct2.collect(Collectors.toList());
        Collections.sort(newlist, (o1, o2) -> {
                    if (o2.getPrice() > o1.getPrice()) {
                        return 1;
                    } else {
                        return -1;
                    }
                });
        System.out.println("Original List:");
        products.forEach(s-> System.out.println(s));
        System.out.println("Filtered List:");
        newlist.forEach(s-> System.out.println(s));
    }
}
