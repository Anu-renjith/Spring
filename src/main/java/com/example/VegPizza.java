package com.example;

import org.springframework.stereotype.Component;

@Component
public class VegPizza implements Pizza{
    @Override
    public String getPizza(){
        return "veg Pizza";
    }
}
