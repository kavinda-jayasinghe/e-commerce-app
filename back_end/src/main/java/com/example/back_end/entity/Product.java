package com.example.back_end.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer productId;

    private String productName;
    private String productDescription;
    private Double productDiscountedPrice;
    private Double productActualPrice;
}
