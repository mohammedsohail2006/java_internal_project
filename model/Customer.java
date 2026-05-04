package model;

public class Customer extends User {
    private String address;

    public Customer(String name, String address) {
        super(name);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}