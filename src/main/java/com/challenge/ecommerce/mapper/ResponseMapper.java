package com.challenge.ecommerce.mapper;

import com.challenge.ecommerce.models.Price;
import com.challenge.ecommerce.models.PriceResponse;

import static com.challenge.ecommerce.helpers.Calculations.calculateFinalPrice;

public class ResponseMapper {
    public static PriceResponse fromPriceEntityToPriceResponse(Price price) {
        return new PriceResponse(price.getProductId(),
                price.getBrand().getBrandId(),
                price.getPrice(),
                price.getStartDate(),
                price.getEndDate(),
                calculateFinalPrice(price.getPrice(), price.getPriceList()));
    }

}
