package com.example.springcoredemo;

public class ATMmachine {
    public ATMmachine(){
        System.out.println("ATM objects are created");
    }
    public void withdrawmoney(double amt){
  System.out.println("transaction success  " +amt+"Rs.");
    }
}
