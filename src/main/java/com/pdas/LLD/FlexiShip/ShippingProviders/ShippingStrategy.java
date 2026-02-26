package com.pdas.LLD.FlexiShip.ShippingProviders;


import com.pdas.LLD.FlexiShip.Order;

import java.math.BigDecimal;

public interface ShippingStrategy {
    BigDecimal calculateShipping(Order order);
}
