package com.challenge.ecommerce.models;

import com.challenge.ecommerce.converters.LocalDateTimeConverter;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "prices")
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @Column(name = "start_date", nullable = false)
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime startDate;

    @Column(name = "end_date", nullable = false)
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime endDate;

    @Column(name = "price_list", nullable = false)
    private Integer priceList;

    @Column(name = "product_id", nullable = false)
    private Integer productId;

    @Column(name = "priority", nullable = false)
    private Integer priority;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "curr", nullable = false)
    private String currency;

}
