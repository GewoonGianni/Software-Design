package discounts;

import com.hz.Customer;

public class ChristmasDiscount implements DiscountStrategy{

    public ChristmasDiscount (){

    }

    @Override
    public double calculateDiscount(Customer customer, Integer index) {
        if (index == 0) {
            return 0.20;
        } else {
            return 0.125;
        }
    }
}
