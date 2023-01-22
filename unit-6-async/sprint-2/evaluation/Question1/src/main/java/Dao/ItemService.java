package Dao;

import Bean.Item;
import Bean.Order;
import java.util.Date;
import java.util.List;
import Exception.NotFoundException;
public interface ItemService {
    public void createItem(Item item, Order order);
    public void createItems(List<Item> items, Order order);
    public void getItem(int itemId) throws NotFoundException;
    public void getOrder(int orderId) throws NotFoundException;
}
