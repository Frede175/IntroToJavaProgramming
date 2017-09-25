/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.Chapter9;

import java.util.Date;

/**
 *
 * @author fsr19
 */
public class Account {
    private int id = 0;
    private double balance = 0, annualInterestRate = 0;
    private final Date dateCreated;
    
    public Account() { 
        dateCreated = new Date();
    }
    
    public Account(int id, double balance) {
        dateCreated = new Date();
        this.id = id;
        this.balance = balance;
    }
    
    public Account(int id, double balance, double annualInterestRate) {
        dateCreated = new Date();
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100;
    }
    
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
    
    public void withdraw(double ammount) {
        balance -= ammount;
    }
    
    public void deposit(double ammount) {
        balance += ammount;
    }
}
