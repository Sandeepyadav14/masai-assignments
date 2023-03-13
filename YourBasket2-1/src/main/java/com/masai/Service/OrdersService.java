package com.masai.Service;

import com.masai.Exception.*;
import com.masai.module.*;
import javax.persistence.criteria.Order;
import java.time.LocalDate;
import java.util.List;

public interface OrdersService {

    Orders addOrder(Orders order,String key) throws OrdersException;
    Orders viewOrder(Integer orderId) throws OrdersException;
    Orders UpdateOrderDetails(Orders order,String key) throws OrdersException;
    List<Orders> viewAllOrders(int custid) throws OrdersException;
    List<Orders> viewAllOrdersBydate(LocalDate date) throws OrdersException;
    List<Orders> viewOrderList() throws OrdersException;
    Orders cancleOrder(int orderid,String key) throws OrdersException;
}
