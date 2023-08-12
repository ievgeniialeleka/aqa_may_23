package com.hillel.lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMarket {
    private List<Product> productlist;

    public ProductMarket(List<Product> productlist) {
        this.productlist = productlist;
    }

    public List<Product> getProductlist() {
        return productlist;
    }

    public void setProductlist(List<Product> productlist) {
        this.productlist = productlist;
    }

    public List<String> getProductNames() {
        return productlist.stream()
                .map(Product::getName)
                .distinct()
                .collect(Collectors.toList());
           }

    public List<String> getProductNamesSorted() {
        productlist.sort(Comparator.comparing(Product::getName));
        return productlist.stream()
                .map(Product::getName)
                .distinct()
                .collect(Collectors.toList());
    }
    public List<Integer> getProductPricesSorted() {
        productlist.sort(Comparator.comparing(Product::getPrice));
        return productlist.stream()
                .map(Product::getPrice)
                .distinct()
                .collect(Collectors.toList());
    }
    public List<Integer> getPricesMoreThan10() {
        return productlist.stream()
                .map(Product::getPrice)
                .filter(p1 -> p1 > 10)
                .collect(Collectors.toList());
    }
    public List<Integer> getPricesLessThan5() {
        return productlist.stream()
                .map(Product::getPrice)
                .filter(p1 -> p1 < 5)
                .collect(Collectors.toList());
    }
    public List<String> convertPricestoString() {
        return productlist.stream()
                .map(Product::getPrice)
                .map(String::valueOf)
                .collect(Collectors.toList());
    }

}
