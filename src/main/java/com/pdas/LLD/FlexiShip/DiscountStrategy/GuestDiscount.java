package com.pdas.LLD.FlexiShip.DiscountStrategy;


import com.pdas.LLD.FlexiShip.Order;

import java.math.BigDecimal;

public class GuestDiscount implements DiscountStrategy{
    @Override
    public BigDecimal applyDiscount(Order order) {
        return BigDecimal.ONE;
    }
}
