package examples.integration;

import examples.domain.Customer;

public interface PaymentGateway {

    void processPayment(Customer customer, double amount);
}
