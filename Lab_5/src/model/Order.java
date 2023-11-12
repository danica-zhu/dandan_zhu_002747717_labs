/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import model.Product;
/**
 *
 * @author danica
 */
public class Order {
    ArrayList<OrderItem> orderItemList;

    public Order() {
        this.orderItemList = new ArrayList<OrderItem>();
    }
    
    public ArrayList<OrderItem> getOrderItem(){
        return orderItemList;
    }
    
    public void setOrderItemList(ArrayList<OrderItem> orderItems) {
        this.orderItemList = orderItems;
    }
    
    public void addOrderItem(Product product, double price, int quantity) {
        OrderItem oredrItem = new OrderItem(product, price, quantity);
        orderItemList.add(oredrItem);
    }
    
    public OrderItem findProduct(Product product){
        for (OrderItem oi:this.getOrderItem()){
            if (oi.getProduct().equals(product)) {
                return oi;
            }
        }
        return null;
    }

    public void deleteItem(OrderItem item) {
        this.orderItemList.remove(item);
    }
}
