package discounts;

import com.hz.Customer;

public class RegularsDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(Customer customer, Integer index) {
        return 0.15;
    }
}
