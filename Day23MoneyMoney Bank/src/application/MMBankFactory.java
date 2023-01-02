package application;

import framework.BankFactory;
import framework.CurrentAcc;
import framework.SavingAcc;

public class MMBankFactory extends BankFactory
{

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc s=new MMSavingAcc(accNo , accNm , accBal , isSalaried);
		return s;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc c=new MMCurrentAcc(accNo , accNm , creditLimit , creditLimit);
		return c; 
	}
	

}