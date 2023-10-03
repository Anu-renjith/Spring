package com.example.springcoredemo;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.expertslab.Expert;

public class App 
{
    public static void main( String[] args )
    {
  
    ApplicationContext cont=new ClassPathXmlApplicationContext("spring.xml");
    Expert at=cont.getBean(Expert.class);
    at.mocktest();
    }
}
