package examples;

import examples.business.DeliveryCalculatorImpl;
import examples.business.OrderController;
import examples.domain.*;
import examples.integration.CreditCardPaymentGateway;
import examples.integration.CryptoPaymentGateway;
import examples.reports.SalesReport;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //This code sets up test data.  It's messy and you can safely ignore it.
        TestData testData = new TestData();

        OrderController orderController = createOrderController();

        //Process some orders.
        OrderHeader order1 = orderController.createOrder(testData.getCustomer("J1")); //John
        order1.setPriority(DeliveryPriority.OVERNIGHT);
        order1.addLine(testData.getItem("BK1"), 2); //Programming book.
        order1.addLine(testData.getItem("BK2"), 1); //Cooking book.
        orderController.processOrder(order1);

        OrderHeader order2 = orderController.createOrder(testData.getCustomer("J2")); //Jane
        order2.setPriority(DeliveryPriority.NORMAL);
        order2.addLine(testData.getItem("WH1"), 1); //Whisky.

        orderController.processOrder(order2);

        //Generate a report.
        List<OrderHeader> orders = new ArrayList<OrderHeader>();
        orders.add(order1);
        orders.add(order2);

        SalesReport salesReport = SalesReport.generateReport(orders);
        salesReport.display();
    }

    private static OrderController createOrderController() {
        OrderController orderController = new OrderController();
        orderController.setDeliveryCalculator(new DeliveryCalculatorImpl());

        //Comment/uncomment these two lines to toggle between different payment gateways.
        orderController.setPaymentGateway(createCryptoPaymentGateway());
        //orderController.setPaymentGateway(createCreditCardoPaymentGateway());

        return orderController;
    }

    private static CryptoPaymentGateway createCryptoPaymentGateway() {
        CryptoPaymentGateway paymentGateway = new CryptoPaymentGateway("TEST-API");
        paymentGateway.setUrl("https://mycryptopayments.test");

        return paymentGateway;
    }

    private static CreditCardPaymentGateway createCreditCardoPaymentGateway() {
        CreditCardPaymentGateway paymentGateway = new CreditCardPaymentGateway();
        paymentGateway.setTargetServerIp("127.0.0.1");
        paymentGateway.setPort(8282);

        return paymentGateway;
    }
}
