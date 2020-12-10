package discounts;

import com.hz.Customer;

public interface DiscountStrategy {
    double calculateDiscount(Customer customer, Integer inedx);
}
