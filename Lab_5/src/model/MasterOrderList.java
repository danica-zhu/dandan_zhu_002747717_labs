/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danica
 */
   public class MasterOrderList {
    private List<Order> orderList;

    public MasterOrderList() {
        orderList = new ArrayList<Order>();
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    
public void addNewOrder(Order order){
    this.orderList.add(order);
}
//
//    public void removeOrder(Order p) {
//        orderList.remove(p);
//    }
//
//    public Order searchOrder(int id) {
//        for (Order order : orderList) {
//            if (order.getModelNumber() == id) {
//                return order;
//            }
//        }
//        return null;
//    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
