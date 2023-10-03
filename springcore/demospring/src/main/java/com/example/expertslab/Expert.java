package com.example.expertslab;

public class Expert {
  private String technology;
  private int duration; 
  private double amount;
public Expert(String technology, int duration, double amount) {
    this.technology = technology;
    this.duration = duration;
    this.amount = amount;
}
   public void mocktest(){
    System.out.println("mock test completed");
    System.out.println("technology"+technology);
        System.out.println("Duration"+duration);
            System.out.println("Amount"+amount);
   }
}
