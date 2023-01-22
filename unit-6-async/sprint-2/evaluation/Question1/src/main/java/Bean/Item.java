package Bean;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
@Entity
@Table(name = "ITEM")
public class Item {



        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
     private int itemId;
        private String name;
        private Date date;
        private Timestamp createdAt;

        @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
        @JoinColumn(name = "order_id")
        private Order order;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", createdAt=" + createdAt +
                ", order=" + order +
                '}';
    }
}

