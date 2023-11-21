package examples.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class OrderHeader {

    private String orderId;
    private Date orderDate;
    private double deliveryFee;
    private DeliveryPriority priority;
    private Customer customer;

    private List<OrderLine> orderLines = new ArrayList<OrderLine>();

    private double orderTotal;

    public OrderHeader(Customer customer) {
        this.customer = customer;

        this.orderId = "ORD" + System.currentTimeMillis();
        this.orderDate = new Date();  //Now.
    }

    public void addLine(Item item, int quantity) {
        OrderLine newLine = new OrderLine();
        newLine.setItem(item);
        newLine.setQuantity(quantity);

        this.orderLines.add(newLine);
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public DeliveryPriority getPriority() {
        return priority;
    }

    public void setPriority(DeliveryPriority priority) {
        this.priority = priority;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderLine> getOrderLines() {
        return Collections.unmodifiableList(orderLines);
    }

    public double getOrderTotal() {
        //Lazy-load order total when it's needed.
        if (orderTotal == 0) {
            for (OrderLine line : orderLines) {
                orderTotal += line.getLineTotal();
            }
        }

        return orderTotal;
    }

    public boolean hasRestrictedItems() {
        for (OrderLine line : orderLines) {
            if (line.getItem().isRestricted()) {
                return true;
            }
        }

        return false;
    }
}
