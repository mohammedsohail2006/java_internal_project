package service;

import model.Order;

public class OrderService {

    public void placeOrder(Order order) {
        System.out.println("\nOrder placed successfully!");
        order.showOrder();
    }
}