package question2;

public class Product {

        private int productId;
        private String productName;
        private int price;
        private int quantity;
        public Product() {
            // TODO Auto-generated constructor stub
        }
        public int getProductId() {
            return productId;
        }
        public void setProductId(int productId) {
            this.productId = productId;
        }
        public String productName() {
            return productName;
        }
        public void setProductname(String productName) {
            this.productName = productName;
        }
        public int getPrice() {
            return price;
        }
        public void setPrice(int price) {
            this.price = price;
        }
        public int getQuntatity() {
            return quantity;
        }
        public void setQuntatity(int quantity) {
            this.quantity = quantity;
        }
        public Product(int productId, String productName, int price, int quantity) {
            super();
            this.productId = productId;
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }
        @Override
        public String toString() {
            return "student2 [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
                    + quantity + "]";
        }



}
