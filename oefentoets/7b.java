class NullCustomer extends Customer {
    boolean isNull() {
        return true;
    }
    Plan getPlan() {
        return new NullPlan();
    }
    // null functionaliteiten
}

customer = (order.customer != null) ? order.customer : new NullCustomer();

plan = customer.getPlan();

