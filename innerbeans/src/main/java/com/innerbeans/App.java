package com.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext cont=new ClassPathXmlApplicationContext("spring.xml");
       TextEditor te=(TextEditor) cont.getBean("texteditor");
       te.spellCheck();
    }
}
