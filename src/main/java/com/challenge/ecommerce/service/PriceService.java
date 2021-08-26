package com.challenge.ecommerce.service;

import com.challenge.ecommerce.mapper.ResponseMapper;
import com.challenge.ecommerce.models.Price;
import com.challenge.ecommerce.models.PriceResponse;
import com.challenge.ecommerce.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class PriceService {
    @Autowired
    PriceRepository priceRepository;

    public PriceResponse findPricesGivenADateAndBrandIdAndProductId(String date , Long brandId, Integer productId) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(date, formatter);
        return priceRepository.findPricesGivenADateAndBrandIdAndProductId(dateTime,brandId,productId).
                stream()
                .findFirst()
                .map(ResponseMapper::fromPriceEntityToPriceResponse)
                .orElseThrow(() -> new NullPointerException("Doesn't find any result for the actual search"));
    }
}
