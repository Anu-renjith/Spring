package com.example.beanprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomProcessor implements BeanPostProcessor{
  public Object postProcessBeforeInitialization(Object  bean,String beanName) throws BeansException {
    System.out.println("postprocess before initialisation()");
    return bean;
  }  
    public Object postProcessAfterInitialization(Object  bean,String beanName) throws BeansException {
    System.out.println("postprocess after initialisation() ");
    return bean;
  }  
  
}
