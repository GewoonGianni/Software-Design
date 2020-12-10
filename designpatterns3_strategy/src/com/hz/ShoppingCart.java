package com.hz;
import products.Product;

import java.util.ArrayList;

public class ShoppingCart extends ArrayList<Product> {

    public double getTotalPrice(DiscountContext context) {

        double totalPrice = 0.0;

        for(Product product : this) {

            int index = this.indexOf(product);

            double discount = context.ExecuteStrategy(index);
            double multiplier = 1 - discount;
            double price = product.getPrice() * multiplier;

            totalPrice += price;
        }

        return totalPrice;
    }
}