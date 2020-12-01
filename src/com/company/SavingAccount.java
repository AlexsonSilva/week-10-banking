package com.company;

public class SavingAccount extends Customer{
    public double balance = 0.00;
    public SavingAccount(String _fName, String _lName, String _email) {
        super(_fName, _lName, _email);
    }
    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public void display(){
        System.out.format("Your saving account balance is %.2f\n", balance);
    }
}
