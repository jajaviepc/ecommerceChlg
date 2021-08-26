package com.challenge.ecommerce.controller;

import com.challenge.ecommerce.models.Price;
import com.challenge.ecommerce.models.PriceResponse;
import com.challenge.ecommerce.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ecommerce")
public class EcommerceController {

    @Autowired
    PriceService priceService;

    @GetMapping("/prices")
    public ResponseEntity<List<PriceResponse>> findPricesGivenADateAndBrandId(@RequestParam(name = "apply_date") String date, @RequestParam(name = "brand_id") Long brandId) {
        return new ResponseEntity<>(priceService.findPricesGivenADateAndBrandId(date, brandId), HttpStatus.OK);
    }
}
