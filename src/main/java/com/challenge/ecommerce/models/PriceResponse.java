package com.challenge.ecommerce.models;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PriceResponse {

    private Integer productId;
    private Long brandId;
    private BigDecimal rate;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private BigDecimal finalPrice;

}
