package com.challenge.ecommerce.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "brand_id")
    private Long brandId;

    @Column(name = "brand_name")
    private String brandName;

}
