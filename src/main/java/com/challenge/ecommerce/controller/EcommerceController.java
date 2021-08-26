package com.challenge.ecommerce.controller;

import com.challenge.ecommerce.models.PriceResponse;
import com.challenge.ecommerce.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ecommerce")
public class EcommerceController {

    @Autowired
    PriceService priceService;

    @GetMapping("/price/{product_id}")
    public ResponseEntity<PriceResponse> findPricesGivenADateAndBrandId(@PathVariable(name = "product_id") Integer productId, @RequestParam(name = "apply_date") String date, @RequestParam(name = "brand_id") Long brandId) {
        return new ResponseEntity<>(priceService.findPricesGivenADateAndBrandIdAndProductId(date, brandId,productId), HttpStatus.OK);
    }
}
