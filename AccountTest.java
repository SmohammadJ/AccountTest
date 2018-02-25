//@code contributor: Mohammad J. Nourbakhsh
package accounttest;

import java.util.Date;

public class AccountTest {

    public static void main(String[] args) {
    	Account coustomer1 = new Account(1122, 1000, 50, "George");
    	
    	coustomer1.deposit(30, new Date());
    	coustomer1.deposit(40, new Date());
    	coustomer1.deposit(50, new Date());
    	
    	coustomer1.withdraw(5, new Date());
    	coustomer1.withdraw(4, new Date());
    	coustomer1.withdraw(2, new Date());
    	
    	System.out.println("AccountHolder: "+coustomer1.getName());
    	System.out.println("AnnualInterestRate: "+coustomer1.getAnnualInterestRate());
    	System.out.println("MounthlyInterestRate: "+coustomer1.getMounthlyInteresrRate());
    	System.out.println("InitialBalance: "+coustomer1.getInitialBalance());
    	for (int i = 0; i < coustomer1.getTransacions().size(); i++) {
			System.out.println("Transaction"+(i+1)+": "+coustomer1.getTransacions().get(i).getTransAmount()+" , "+coustomer1.getTransacions().get(i).getTransChar()+" , "+coustomer1.getTransacions().get(i).getTransDescription()+" , "+coustomer1.getTransacions().get(i).getTransBalance()+" , "+coustomer1.getTransacions().get(i).getTransDate() );
		}
    	System.out.println("FinalBalance: "+coustomer1.getBalance());
    
    	
    	
    }
    
    
    
}
