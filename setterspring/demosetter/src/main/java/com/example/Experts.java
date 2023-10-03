package com.example;

public class Experts {
    private String technology;
  private int duration; 
  private double amount;

   public String getTechnology() {
    return technology;
}

public void setTechnology(String technology) {
    this.technology = technology;
}

public int getDuration() {
    return duration;
}

public void setDuration(int duration) {
    this.duration = duration;
}

public double getAmount() {
    return amount;
}

public void setAmount(double amount) {
    this.amount = amount;
}

public void mocktest(){
    System.out.println("mock test completed");
    System.out.println("technology"+technology);
        System.out.println("Duration"+duration);
            System.out.println("Amount"+amount);
   }
}
