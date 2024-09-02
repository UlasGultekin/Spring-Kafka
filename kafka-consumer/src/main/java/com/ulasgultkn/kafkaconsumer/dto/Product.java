package com.ulasgultkn.kafkaconsumer.dto;

import lombok.Data;

@Data
public class Product {

    public String title;
    public String description;
    public String color;
    public int price;
    public boolean isInStock;


}
