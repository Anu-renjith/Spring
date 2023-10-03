package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext cont=new ClassPathXmlApplicationContext("spring.xml");
    Experts at=cont.getBean(Experts.class);
    at.mocktest();
    }
}
