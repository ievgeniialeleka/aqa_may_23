package com.hillel.lesson16;

import java.util.Comparator;

public class Product {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product " + getName() + " costs " + getPrice();
    }

    public static class ComparatorByPrice implements Comparator<Product>{
        @Override
        public int compare(Product p1, Product p2) {
            return Integer.compare(p1.price, p2.price);
        }
    }
}
