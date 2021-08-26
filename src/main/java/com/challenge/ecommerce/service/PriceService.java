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
import java.util.stream.Collectors;

@Service
public class PriceService {
    @Autowired
    PriceRepository priceRepository;

    public List<Price> getAllPrices() {
        return priceRepository.findAll();
    }

    public List<PriceResponse> findPricesGivenADateAndBrandId(String date , Long brandId) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(date, formatter);
        return priceRepository.findPricesGivenADateAndBrandId(dateTime,brandId).
                stream().map(ResponseMapper::fromPriceEntityToPriceResponse)
                .collect(Collectors.toList());
    }
}
