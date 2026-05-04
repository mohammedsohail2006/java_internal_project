package main;

import model.*;
import service.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your address: ");
        String address = sc.nextLine();

        Customer customer = new Customer(name, address);

        Restaurant r1 = new Restaurant("Pizza Hub");
        r1.addItem(new MenuItem("Pizza", 250));
        r1.addItem(new MenuItem("Burger", 120));

        Restaurant r2 = new Restaurant("Food Court");
        r2.addItem(new MenuItem("Biryani", 200));
        r2.addItem(new MenuItem("Fried Rice", 150));

        List<Restaurant> restaurants = Arrays.asList(r1, r2);

        System.out.println("\nChoose Restaurant:");
        for (int i = 0; i < restaurants.size(); i++) {
            System.out.println((i+1) + ". " + restaurants.get(i).getName());
        }

        int choice = sc.nextInt();
        Restaurant selected = restaurants.get(choice - 1);

        System.out.println("\nMenu:");
        List<MenuItem> menu = selected.getMenu();
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i+1) + ". " + menu.get(i).getName() + " ₹" + menu.get(i).getPrice());
        }

        Order order = new Order(customer);

        System.out.print("How many items you want? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Select item number: ");
            int itemChoice = sc.nextInt();
            order.addItem(menu.get(itemChoice - 1));
        }

        OrderService orderService = new OrderService();
        order.setStatus("ORDER PLACED");
        orderService.placeOrder(order);

        System.out.println("\nSelect Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Card");

        int payChoice = sc.nextInt();
        Payment payment = PaymentFactory.getPaymentMethod(payChoice);

        payment.pay(order.getTotal());

        order.setStatus("PAID");

        DeliveryAgent agent = new DeliveryAgent("Rahul");
        agent.deliverOrder();

        order.setStatus("DELIVERED");
        order.showOrder();
    }
}