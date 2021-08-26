package com.challenge.ecommerce.helpers;

import java.math.BigDecimal;

public class Calculations {

    public static BigDecimal calculateFinalPrice (BigDecimal price, Integer quantity) {
        return price.multiply(new BigDecimal(quantity));
    }
}
