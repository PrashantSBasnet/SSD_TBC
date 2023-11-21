package examples.reports;

import examples.domain.OrderHeader;
import examples.domain.OrderLine;

import java.util.List;

public class SalesReport {

    protected List<OrderHeader> orders;

    private SalesReport(List<OrderHeader> orders) {
        this.orders = orders;
    }

    public static SalesReport generateReport(List<OrderHeader> orders) {
        return new SalesReport(orders);
    }

    public void display() {
        //Write simple output to console.
        System.out.println("===SALES REPORT===");

        for (OrderHeader order : orders) {
            System.out.println("Order: " + order.getOrderId() + ", Date: " + order.getOrderDate() + ", Total: " + order.getOrderTotal());
        }

        System.out.println("====END REPORT====");
    }

}
