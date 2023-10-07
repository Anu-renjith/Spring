package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
ApplicationContext cont=new ClassPathXmlApplicationContext("spring.xml");
System.out.println("calling PizzaController.getPizza()");
PizzaController pc=cont.getBean(PizzaController.class);
String message=pc.getPizza();
System.out.println(message);
((AbstractApplicationContext) cont).close();

    }
    
}
