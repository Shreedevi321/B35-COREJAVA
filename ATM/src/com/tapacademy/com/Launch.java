package com.tapacademy.com;

import java.io. IOException;
import java.util.Scanner;

class InvalidInputException extends Exception
{
	
}
class ATM
{
	int pin=4974;
	int p;
	void acceptInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the pin number");
		p=scan.nextInt();
	}
	void validate()throws Exception
	{
		if (pin==p)
		{
			System.out.println("collect your money");
		}
		else
		{
			InvalidInputException ie=new InvalidInputException();
			System.out.println("invalid pin number");
			throw ie;
		}
	}
}
class Bank
{
	void init()
	{
		ATM a=new ATM();
		try
		{
			a.acceptInput();
			a.validate();
		}
		catch (Exception e) {
			try
			{
				a.acceptInput();
				a.validate();
			}
			catch(Exception f)
			{
				try
				{
					a.acceptInput();
					a.validate();
				}
				catch(Exception g)
				{
					System.out.println("card blocked contact your bank");
				}
			}
		}
	}
}

public class Launch {

	public static void main(String[] args) {
		Bank a=new Bank();
		a.init();
	}

}
