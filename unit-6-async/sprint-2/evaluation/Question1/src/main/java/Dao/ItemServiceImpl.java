package Dao;

import Bean.Item;
import Bean.Order;
import Util.Manager;
import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;
import java.util.Set;
import Exception.NotFoundException;
public class ItemServiceImpl implements ItemService{
    @Override
    public void createItem(Item item, Order order) {
        EntityManager em= Manager.provideConnection();
        em.getTransaction().begin();
        item.setOrder(order);
        em.persist(item);
        em.getTransaction().commit();

    }

    @Override
    public void createItems(List<Item> items, Order order) {
        EntityManager em= Manager.provideConnection();
        em.getTransaction().begin();
        for (Item i:items) {
            order.getItems().add(i);
        }
        em.persist(items);
        em.getTransaction().commit();
        em.close();


    }

    @Override
    public void getItem(int itemId) throws NotFoundException {
        EntityManager em= Manager.provideConnection();
       Item item= em.find(Item.class,itemId);
       if(item!=null) {
           System.out.println(item.getItemId());
           System.out.println(item.getCreatedAt());
           System.out.println(item.getDate());
           System.out.println(item.getName());
           System.out.println(item.getOrder());
       }else{
           throw new NotFoundException("Id in not valid..."+itemId);
       }
    }

    @Override
    public void getOrder(int orderId) throws NotFoundException {
        EntityManager em= Manager.provideConnection();
        Order order= em.find(Order.class,orderId);
        if(order!=null) {
            System.out.println(order.getOrderid());
            System.out.println(order.getCreatedAt());
            System.out.println(order.getDeliveryAddress());
            System.out.println(order.getTotalAmount());
            Set<Item> itemList = order.getItems();
            for (Item i : itemList) {
                System.out.println(i.getOrder());
                System.out.println(i.getItemId());
                System.out.println(i.getName());
                System.out.println(i.getDate());
                System.out.println(i.getCreatedAt());

            }
        }else{
            throw new NotFoundException("Id in not valid..."+orderId);
        }

    }

    @Override
    public void getItems(Date inputDate) {

    }
}
