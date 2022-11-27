package Classdemo;

import java.util.Scanner;

public class ClassandObject {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the speed of the car:");
			int speed=s.nextInt();
			
			//creation of object
			Car obj=new Car();
			
			//compile time input
			//obj.speed=45;
			obj.speed(speed);
			s.close();

		}
}


