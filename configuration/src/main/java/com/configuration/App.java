package com.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.AnnotationConfigurationException;

public class App 
{
    public static void main( String[] args )
    {
    AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
    ctx.register(AppConfig.class);
    ctx.refresh();
    Entitlement ent=(Entitlement) ctx.getBean("entitlement");
    System.out.println(ent.getName());
    System.out.println(ent.getTime());
    }
}
