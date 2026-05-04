package model;

import java.util.*;

public class Order {
    private Customer customer;
    private List<MenuItem> items = new ArrayList<>();
    private String status;

    public Order(Customer customer) {
        this.customer = customer;
        this.status = "CREATED";
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double getTotal() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void showOrder() {
        System.out.println("\nCustomer: " + customer.getName());
        for (MenuItem item : items) {
            System.out.println(item.getName() + " - ₹" + item.getPrice());
        }
        System.out.println("Total: ₹" + getTotal());
        System.out.println("Status: " + status);
    }
}