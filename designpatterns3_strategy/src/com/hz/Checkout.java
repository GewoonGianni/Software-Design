package com.hz;

import discounts.BlackFridayDiscount;
import discounts.ChristmasDiscount;
import discounts.RegularsDiscount;

public class Checkout {

    private SalesAction salesAction;

    public Checkout(SalesAction action) {
        this.salesAction = action;
    }

    public void nextInLine(Customer customer) {
        // init checkout
        DiscountContext discount = new DiscountContext(customer);

        if(salesAction == SalesAction.ChristmasEve) {
            discount.setStrategy(new ChristmasDiscount());
        } else if (salesAction == SalesAction.BlackFriday) {
            discount.setStrategy(new BlackFridayDiscount());
        } else if (salesAction == SalesAction.NoAction) {
            if (customer.isRegular()){
                discount.setStrategy(new RegularsDiscount());
            }
        }

        // Welcome customer
        String welcome = String.format("Hello %s, would you pass me your shopping cart?",
                customer.getName());
        Console.write(welcome);

        ShoppingCart cart = customer.getCart();
        double amountToPay = cart.getTotalPrice(discount);
        String payinfo = String.format("Let's see, that will be.. %.02f. Cash or card?", amountToPay);
        Console.write(payinfo);
    }
}
