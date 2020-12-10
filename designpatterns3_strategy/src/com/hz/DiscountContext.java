package com.hz;

import discounts.DiscountStrategy;

public class DiscountContext {
    private Customer customer;
    public DiscountStrategy strategy;

    /**
     * Constructor
     * @param customer the customer to perform on
     */
    public DiscountContext (Customer customer) {
        this.customer = customer;
    }

    /**
     * Execute the needed strategy
     * @return discount
     */
    public double ExecuteStrategy (Integer index) {
        return strategy.calculateDiscount(this.customer, index);
    }

    /**
     * add strategy to the context
     * @param strategy the strategy to add
     */
    public void setStrategy (DiscountStrategy strategy) {
        this.strategy = strategy;
    }
}
