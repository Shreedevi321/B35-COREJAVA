package Kodnest;

import java.util.Scanner;


public class addition
{
public static void main(String[]arg)
{
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter 2 numbers");
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=a+b;
	System.out.println("Addition result:" +c);
}

}
