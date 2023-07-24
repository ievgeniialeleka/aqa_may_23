package com.hillel.lesson16;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductMarketTest {

    List<Product> productlist;
    ProductMarket productmarket;

    @BeforeEach
    void setup() {
        productlist = new ArrayList<>();
        productlist.add(new Product("Bread", 4));
        productlist.add(new Product("Water", 2));
        productlist.add(new Product("Milk", 7));
        productlist.add(new Product("Eggs", 15));
        productlist.add(new Product("Juice", 12));
        productlist.add(new Product("Coffee", 17));
        productmarket = new ProductMarket(productlist);
    }

    @AfterEach
    void teardown() {
        productlist.clear();
        productmarket = null;
    }


    @Test
    void getProductNames() {
        List<String> actual = productmarket.getProductNames();
        List<String> expected = List.of("Bread", "Water", "Milk", "Eggs", "Juice", "Coffee");
        assertEquals(expected, actual);
    }

    @Test
    void getProductNamesSorted() {
        List<String> actual = productmarket.getProductNamesSorted();
        List<String> expected = List.of("Bread", "Coffee", "Eggs", "Juice", "Milk", "Water");
        assertEquals(expected, actual);
    }

    @Test
    void getPricesMoreThan10() {
        List<Integer> actual = productmarket.getPricesMoreThan10();
        List<Integer> expected = List.of(15,12,17);
        assertEquals(expected, actual);
    }

    @Test
    void getPricesLessThan5() {
        List<Integer> actual = productmarket.getPricesLessThan5();
        List<Integer> expected = List.of(4,2);
        assertEquals(expected, actual);
    }

    @Test
    void convertPricestoString() {
        List<String> actual = productmarket.convertPricestoString();
        List<String> expected = List.of("4","2","7","15","12","17");
        assertEquals(expected, actual);
    }
}