package examples.business;

import examples.domain.Address;
import examples.domain.DeliveryPriority;
import examples.domain.OrderHeader;

public class DeliveryCalculatorImpl implements DeliveryCalculator {

    private static final double OVERNIGHT_DELIVERY_FEE = 75;
    private static final double DELIVERY_FEE_WAIVE_AMOUNT = 50;

    @Override
    public double calculateDelivery(OrderHeader order) {
        DeliveryPriority priority = order.getPriority();

        if (priority == DeliveryPriority.OVERNIGHT) {
            return OVERNIGHT_DELIVERY_FEE;
        } else {
            if (order.getOrderTotal() > DELIVERY_FEE_WAIVE_AMOUNT) {
                return 0; //Free delivery
            }

            int distance = calculateDistance(order.getCustomer().getAddress());
            return distance * 0.5;  //Simple demo calculation - probably not a good idea in real life!
        }
    }

    protected int calculateDistance(Address customerAddress) {
        //Invoke a service somewhere to calculate distance from our warehouse to the customer's address.
        return 42;
    }
}
