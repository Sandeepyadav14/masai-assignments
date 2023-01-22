package Main;

import Bean.Item;
import Bean.Order;
import Dao.ItemService;
import Dao.ItemServiceImpl;
//import Bean.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Timestamp;
import java.util.Date;

public class AddEmp {

    public static void main(String[] args) {
       Date date=new Date();
        Order order = new Order();
        order.setCreatedAt(new Timestamp(date.getTime()));
        order.setDeliveryAddress("mumbaui");
        order.setTotalAmount(99);
        Item item = new Item();
        item.setName("Manu Manjunatha");
        item.setDate(java.sql.Date.valueOf("2013-09-29"));
        item.setCreatedAt(new Timestamp(date.getTime()));
        order.getItems().add(item);
        ItemService itemService=new ItemServiceImpl();
        itemService.createItem(item,order);




    }
}
