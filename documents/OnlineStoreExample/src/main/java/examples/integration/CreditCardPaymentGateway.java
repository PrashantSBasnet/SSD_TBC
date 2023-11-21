package examples.integration;

import examples.domain.Customer;

public class CreditCardPaymentGateway implements PaymentGateway {

    private String targetServerIp;
    private int port;

    @Override
    public void processPayment(Customer customer, double amount) {
        System.out.printf("Invoking credit card payment gateway on %s:%d%n", targetServerIp, port);

        //Unimplemented; high-level flow is below.
        //Establish connection to target IP on specified port.
        authenticate();
        //Create request to credit card payment gateway.
        //Send request.

        System.out.println("Payment successful!");
    }

    protected void authenticate() {
        //Unimplemented; high-level flow is below.
        //Send authentication request to credit card payment gateway.
    }

    public String getTargetServerIp() {
        return targetServerIp;
    }

    public void setTargetServerIp(String targetServerIp) {
        this.targetServerIp = targetServerIp;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
