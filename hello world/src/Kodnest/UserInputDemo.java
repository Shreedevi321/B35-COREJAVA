package Kodnest;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("please enter age");
		byte age=scan.nextByte();
		System.out.println("Age=" +age);
		
		System.out.println("please enter height");
		float height=scan.nextFloat();
		System.out.println("Height=" +height);
		
		
		
		

	}

}
