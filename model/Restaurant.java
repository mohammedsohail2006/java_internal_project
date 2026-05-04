package model;

import java.util.*;

public class Restaurant {
    private String name;
    private List<MenuItem> menu = new ArrayList<>();

    public Restaurant(String name) {
        this.name = name;
    }

    public void addItem(MenuItem item) {
        menu.add(item);
    }

    public List<MenuItem> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }
}