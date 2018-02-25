//@code contributor: Mohammad J. Nourbakhsh
package accounttest;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    
    private String name;
    private int id ;
    private double balance;
    private double initialBalance;
    private double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>() ;
    
    public Account(){
    	this.id = 0;
    	this.balance = 0;
    	this.annualInterestRate = 0;	
    }
    
    public Account(int id, double balance, double annualInterestRate, String name ){
        this.id = id;
        this.balance = balance;
        this.initialBalance = balance;
        this.annualInterestRate = annualInterestRate;    
        this.name = name;
    }
    
    public Date getDateCreated(){
    	return this.dateCreated;
    }
    
    public double getAnnualInterestRate(){
    	return this.annualInterestRate/100;
    }
    
    public double getMounthlyInteresrRate(){
    	return (this.annualInterestRate/100)/12;
    }
    
    public double getMounthlyInterest(){
    	return balance*((this.annualInterestRate/100)/12);
    }
    
    public void withdraw(double withdraw, Date date){
    	this.balance -= withdraw;
    	transactions.add(new Transaction(date, 'W', withdraw, this.balance, "Bardasht"));
    	
    }
    
    public void deposit(double diposit, Date date){
    	this.balance += diposit;
    	transactions.add(new Transaction(date, 'D', diposit, this.balance, "Afzayesh"));
    }
    
    public ArrayList<Transaction> getTransacions(){
		return transactions;
    	
    }
    
    public int getId(){
    	return this.id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public double getBalance(){
        return balance;
    }  
    public double getInitialBalance(){
    	return this.initialBalance;
    }
}
