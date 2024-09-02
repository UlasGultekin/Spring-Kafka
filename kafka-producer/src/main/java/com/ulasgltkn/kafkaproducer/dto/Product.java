package com.ulasgltkn.kafkaproducer.dto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Product {

    public String title;
    public String description;
    public String color;
    public int price;
    public boolean isInStock;


}
