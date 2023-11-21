package examples.business;

import examples.domain.OrderHeader;

public interface DeliveryCalculator {

    double calculateDelivery(OrderHeader order);
}
