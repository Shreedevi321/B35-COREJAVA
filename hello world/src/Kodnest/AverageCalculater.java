package Kodnest;
import java.util.Scanner;
public class AverageCalculater {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int n3=scan.nextInt();
		
		int sum=n1+n2+n3;
		double avg=sum/3.0;
		System.out.println("Average" +avg);

}
}