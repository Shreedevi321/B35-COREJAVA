package OperatorsDemo;
import java.util.Scanner;

public class AssignmentOperaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a and b:");
		int a=s.nextInt();
		int b=s.nextInt();
		a+=b;
		System.out.println("The value of a is: "+a);
		s.close();

	}

}


	