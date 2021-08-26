package com.challenge.ecommerce.repository;

import com.challenge.ecommerce.models.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {

    List<Price> findAll();

    @Query("select prices from Price prices where prices.startDate <= :dateToApply and prices.endDate >= :dateToApply and prices.brand.brandId = :brandId and prices.productId = :productId order by prices.priority desc")
    List<Price> findPricesGivenADateAndBrandIdAndProductId(@Param("dateToApply") LocalDateTime dateToApply, @Param("brandId") Long brandId, @Param("productId") Integer productId);
}
