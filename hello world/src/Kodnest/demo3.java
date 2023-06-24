package Kodnest;

import java.util.Scanner;

public class demo3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Any Number between 1-4");
		
		int num=scan.nextInt();
		switch(num)
		{
		    case 1:
			System.out.println("you have entered-1");
		    break;
		
		    case 2 :
            System.out.println("you have entered-2");
	      	break;
    
		    case 3:
    	    System.out.println("you have entered-3");
            break;
     
		    case 4:
 	       System.out.println("you have entered-4");
            break;
            
            default:
		    System.out.println("pleas Read the msg properly");
           
		}
	}
}

