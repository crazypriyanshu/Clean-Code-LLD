package com.pdas.LLD.FlexiShip.ShippingProviders;


import com.pdas.LLD.FlexiShip.Order;

import java.math.BigDecimal;

public class DHLShippingStrategy implements ShippingStrategy{
    @Override
    public BigDecimal calculateShipping(Order order) {
        return BigDecimal.valueOf(order.getWeight() * 5);
    }
}
