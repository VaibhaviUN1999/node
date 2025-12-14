package com.curd.curd.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Product {

    private int prodId;
    private String name;
    private int price;

    public Product(){}
}

