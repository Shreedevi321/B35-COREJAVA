package client;

import application.MMBankFactory;
import application.MMCurrentAcc;
import application.MMSavingAcc;
import framework.BankFactory;
import framework.CurrentAcc;
import framework.SavingAcc;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		BankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(831080382, "Girisha doddamani", 15000, true);
		CurrentAcc c=new MMCurrentAcc(897066419, "Chiru", 300000, 22000);
		System.out.println();
		System.out.println("Saving Account is : "); 
		s.withdraw(s.getAccBal());
		System.out.println();
		System.out.println("Current Account is : "); 
		c.withdraw(c.getAccBal());
		System.out.println();
		System.out.println(s); 
		System.out.println(c); 
	}

}