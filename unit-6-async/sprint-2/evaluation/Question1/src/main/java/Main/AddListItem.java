package Main;

import Bean.Item;
import Bean.Order;
import Dao.ItemService;
import Dao.ItemServiceImpl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AddListItem {
public static void main(String[] args) {
    Date date=new Date();

    Order order = new Order();
    order.setCreatedAt(new Timestamp(date.getTime()));
    order.setDeliveryAddress("Karnatka");
    order.setTotalAmount(9921);

    Item item = new Item();
    item.setName("Sandeep");
    item.setDate(java.sql.Date.valueOf("2024-09-10"));
    item.setCreatedAt(new Timestamp(date.getTime()));
    item.setOrder(order);

    Item item1 = new Item();
    item1.setName("Sandeep");
    item1.setDate(java.sql.Date.valueOf("2024-09-10"));
    item1.setCreatedAt(new Timestamp(date.getTime()));
    item1.setOrder(order);

    order.getItems().add(item);
    order.getItems().add(item1);

    List<Item> itemList=new ArrayList<>();
    itemList.add(item);
    itemList.add(item1);

    ItemService itemService=new ItemServiceImpl();
    itemService.createItems(itemList,order);


}
}
