package com.hillel.lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        List<String> productnames = new ArrayList<>();
        for(Product p : productlist) {
            productnames.add(p.getName());
        }
        return productnames;
    }

    public List<String> getProductNamesSorted() {
        List<String> productnames = new ArrayList<>();
        for(Product p : productlist) {
            productnames.add(p.getName());
        }
        Collections.sort(productnames);
        return productnames;
    }

    public List<Integer> getPricesMoreThan10() {
        List<Integer> prices = new ArrayList<>();
        for(Product p : productlist) {
            if(p.getPrice() > 10) {
                prices.add(p.getPrice());
            }
        }
        return prices;
    }

    public List<Integer> getPricesLessThan5() {
        List<Integer> prices = new ArrayList<>();
        for(Product p : productlist) {
            if(p.getPrice() < 5) {
                prices.add(p.getPrice());
            }
        }
        return prices;
    }

    public List<String> convertPricestoString() {
        List<String> prices = new ArrayList<>();
        for(Product p : productlist) {
            prices.add(String.valueOf(p.getPrice()));
        }
        return prices;
    }

}
