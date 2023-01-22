package Bean;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
    @Table(name = "ORDERS")
    public class Order {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int orderid;
        private String deliveryAddress;
        private int totalAmount;
        private Timestamp createdAt;
        @OneToMany(fetch = FetchType.EAGER,mappedBy = "order")
        private Set<Item> items = new HashSet<Item>();

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderid=" + orderid +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", totalAmount=" + totalAmount +
                ", createdAt=" + createdAt +
                ", items=" + items +
                '}';
    }
}

