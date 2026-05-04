package model;

public class DeliveryAgent extends User {

    public DeliveryAgent(String name) {
        super(name);
    }

    public void deliverOrder() {
        System.out.println(name + " is delivering the order...");
    }
}