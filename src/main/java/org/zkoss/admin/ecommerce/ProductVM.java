package org.zkoss.admin.ecommerce;

import org.zkoss.bind.annotation.Init;

import java.util.*;

public class ProductVM {
    private List<Product> productList = new LinkedList<>();
    static String productNames[] = {"Charts", "Framework", "Theme Pack", "Spreadsheet", "Calendar", "Pivot Table"};
    static private Random random = new Random();

    @Init
    public void init(){
        queryProduct();
    }

    private void queryProduct(){
        for (String name :productNames){
            Product product = new Product(name);
            product.setQuantity(random.nextInt(100));
            product.setPrice(random.nextInt(1000) / 10);
            productList.add(product);
        }
    }

    public List<Product> getProductList() {
        return productList;
    }
}
