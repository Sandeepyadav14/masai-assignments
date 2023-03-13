package com.masai.Service;

import com.masai.Exception.*;
import com.masai.module.*;

import java.util.List;

public interface CartService {

	Cart createCart(Cart cart) throws CartException;
    Vegetable addToCart(Integer cartId,Vegetable veg,String key) throws VegetableException;
    Cart increaseVegQuantity(Integer cartId,Integer vegid, Integer quantity,String key) throws VegetableException;
    Cart dcreaseVegQuantity(Integer cartId,Integer vegid, Integer quantity,String key) throws VegetableException;
    Cart removeVegetables(Integer id) throws VegetableException;
    Cart removeAllVegetables(Integer cartId) throws VegetableException;
    List<Vegetable> ViewAllItems(Integer cartId) throws VegetableException;

}
