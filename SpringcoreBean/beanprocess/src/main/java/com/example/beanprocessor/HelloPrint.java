package com.example.beanprocessor;

public class HelloPrint {
    private String msg;

    public void getMsg() {
       System.out.println("message is"+msg);
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public void init(){
        System.out.println("initialising bean");
    }
    public void destroy(){
        System.out.println("destroying bean");
    }
}
