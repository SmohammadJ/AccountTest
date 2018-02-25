//@code contributor: Mohammad J. Nourbakhsh
package accounttest;

import java.util.Date;

public class Transaction {
	private Date transDate;
	private char transChar;
	private double transAmount;
	private double transBalance;
	private String transDescription;
	
	public Transaction(Date transDate, char transChar,
			double transAmount,double transBalance,
			String transDescription){
		this.transDate = transDate;
		this.transChar = transChar;
		this.transAmount = transAmount;
		this.transBalance = transBalance;
		this.transDescription = transDescription;
		
	}
	
	public Date getTransDate(){
		return this.transDate;
	}
	
	public char getTransChar(){
		return this.transChar;
	}
	
	public double getTransAmount(){
		return this.transAmount;
	}
	
	public double getTransBalance(){
		return this.transBalance;
	}
	
	public String getTransDescription(){
		return this.transDescription;
	}
}
