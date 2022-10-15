package Question1;

public class Product implements Comparable<Product> {

    String productName;
    double productPrice;

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Product() {

    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if(this.productPrice==o.productPrice){
            return 0;
        }
        if(this.productPrice>o.productPrice){
            return 1;
        }else{
            return -1;
        }
    }
}
