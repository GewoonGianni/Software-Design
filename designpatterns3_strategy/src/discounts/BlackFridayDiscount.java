package discounts;

import com.hz.Customer;
import products.Product;

public class BlackFridayDiscount implements DiscountStrategy{
    public BlackFridayDiscount () {

    }

    @Override
    public double calculateDiscount(Customer customer, Integer index) {
        Product last = customer.getCart().get(customer.getCart().size() - 1);
        int lastIndex = customer.getCart().indexOf(last);
        if (lastIndex <= 80) {
            return (double) (lastIndex / 100);
        } else {
            return 0.80;
        }
    }
}
