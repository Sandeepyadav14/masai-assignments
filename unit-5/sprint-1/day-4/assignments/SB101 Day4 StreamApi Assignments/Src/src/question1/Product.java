package question1;

public class Product {
    int productId;
    String productName;
    int Price;
    int quantity;

    public Product(int productId, String productName, int price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        Price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", Price=" + Price +
                ", quantity=" + quantity +
                '}';
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
