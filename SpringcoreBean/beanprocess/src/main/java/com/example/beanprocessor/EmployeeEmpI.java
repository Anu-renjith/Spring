package com.example.beanprocessor;

public class EmployeeEmpI {
    public Employee createEmp(){
        Employee e=new Employee();
        e.setName("Ammu");
        e.setEmail("ammu@gmail.com");
        return e;
    }
    public void initBean(){
        System.out.println("EmployeeEmpI initialized");
    }
    public void destroyBean(){
        System.out.println("EmployeeEmpI destroyed");
    }
}
