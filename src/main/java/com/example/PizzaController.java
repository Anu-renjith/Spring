package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaController {
    // field injection
    @Autowired
    @Qualifier("vegPizza")
    private Pizza pizza;
    // constructoir injection
// @Autowired
// public PizzaController(@Qualifier("vegPizza") Pizza pizza){
// System.out.println("inside PizzaController constructor");
// this.pizza=pizza;
// }
//setter injection
// @Autowired
//     @Qualifier("vegPizza")
//     public void setPizza(Pizza pizza) {
//         this.pizza = pizza;
//     }
public String getPizza(){
    return pizza.getPizza();
}
}
