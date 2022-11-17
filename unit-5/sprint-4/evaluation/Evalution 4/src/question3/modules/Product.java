package modules;

public class Product {
    private  int  productid;
    private String productname;
    private int price;
    private int quantity;

    public Product() {
    }

    public int getProductid() {
        return productid;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productid=" + productid +
                ", productname='" + productname + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(int productid, String productname, int price, int quantity) {
        this.productid = productid;
        this.productname = productname;
        this.price = price;
        this.quantity = quantity;
    }


}
