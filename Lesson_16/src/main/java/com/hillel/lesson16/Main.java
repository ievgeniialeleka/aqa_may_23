package com.hillel.lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> productlist = new ArrayList<>();
        productlist.add(new Product("Bread", 4));
        productlist.add(new Product("Water", 2));
        productlist.add(new Product("Milk", 22));
        productlist.add(new Product("Eggs", 5));
        productlist.add(new Product("Juice", 12));
        productlist.add(new Product("Coffee", 17));

        ProductMarket silpo = new ProductMarket(productlist);
        System.out.println(silpo.getProductNames());
        System.out.println(silpo.getProductNamesSorted());
        System.out.println(silpo.getPricesMoreThan10());
        System.out.println(silpo.getPricesLessThan5());
        System.out.println(silpo.convertPricestoString());

        System.out.println("Before sorting:");
        for(Product tmp : productlist) {
            System.out.println(tmp);
        }
        Collections.sort(productlist, new Product.ComparatorByPrice());
        System.out.println("After sorting: ");
        for(Product tmp : productlist) {
            System.out.println(tmp);
        }
    }
}
