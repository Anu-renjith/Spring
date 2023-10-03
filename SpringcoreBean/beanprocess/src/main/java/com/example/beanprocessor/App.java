package com.example.beanprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext cont=new ClassPathXmlApplicationContext("spring.xml");
    //    EmployeeEmpI ob=(EmployeeEmpI) cont.getBean("empi");
    //    Employee emp=ob.createEmp();
    //    System.out.println("employee details:");
    //    System.out.println("name"+emp.getName());
    //    System.out.println("name"+emp.getEmail());
    // HelloPrint ob=(HelloPrint) cont.getBean("hello");
    // ob.getMsg();
    // HelloWorld ob=(HelloWorld) cont.getBean("helloworld");
    // ob.getMsg1();
    //   ob.getMsg2();
     
     
     HelloIndia obj=(HelloIndia) cont.getBean("helloindia");
     obj.getMsg1();
      obj.getMsg2();
      obj.getMsg3();
    }
}
