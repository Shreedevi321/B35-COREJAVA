package Kodnest;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args)
	{
	Scanner scan= new Scanner(System.in);
	System.out.println("enter two numbers");
	int a=scan.nextInt();
	int b=scan.nextInt();
	
	int  c=a+b;
	System.out.println("Addition Result:" +c);
	
	 int  d=a-b;
	System.out.println("Substraction Result:" +d);
	
     int e=a*b;
	System.out.println("Multiplication Result:" +e );
	
	int f=a/b;
	System.out.println("Devision Result:" +f);
	
	
	}


	
}


