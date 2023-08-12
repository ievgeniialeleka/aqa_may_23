package com.hillel.lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> productlist = new ArrayList<>();
        productlist.add(new Product("Bread", 4));
        productlist.add(new Product("Bread", 6));
        productlist.add(new Product("Water", 2));
        productlist.add(new Product("Milk", 22));
        productlist.add(new Product("Eggs", 5));
        productlist.add(new Product("Juice", 12));
        productlist.add(new Product("Coffee", 17));

        ProductMarket silpo = new ProductMarket(productlist);

        System.out.println("Names of the products: ");
        System.out.println(silpo.getProductNames());
        System.out.println();
        System.out.println("Names of the products sorted: ");
        System.out.println(silpo.getProductNamesSorted());
        System.out.println();
        System.out.println("Prices sorted: ");
        System.out.println(silpo.getProductPricesSorted());
        System.out.println();
        System.out.println("Prices more than 10");
        System.out.println(silpo.getPricesMoreThan10());
        System.out.println();
        System.out.println("Prices less than 5");
        System.out.println(silpo.getPricesLessThan5());
        System.out.println();
        System.out.println("Prices as Strings: ");
        System.out.println(silpo.convertPricestoString());
    }
}
