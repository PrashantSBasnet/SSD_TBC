package examples.integration;

import examples.domain.Customer;

public class CryptoPaymentGateway implements PaymentGateway {

    private String url;
    private String apiKey;

    public CryptoPaymentGateway(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public void processPayment(Customer customer, double amount) {
        System.out.printf("Invoking cryptocurrency payment gateway on %s with API key: %s%n", url, apiKey);

        //Unimplemented; high-level flow is below.
        //Create request to cryptocurrency payment gateway.
        //Send request to URL with API key.
        System.out.println("Payment successful!");
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
