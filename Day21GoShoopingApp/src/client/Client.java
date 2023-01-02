package client;

import application.GSNormalAcc;
import application.GSPrimeAcc;
import application.GSShopFactory;
import framework.NormalAcc;
import framework.PrimeAcc;
import framework.ShopFactory;

//Driver class(Executor)
public class Client {

	public static void main(String[] args) {
		ShopFactory f=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(1001,"Girisha",500,true);
		NormalAcc n=new GSNormalAcc(1002,"Dharmendra",500,70);
		System.out.println("Prime Account Details: ");
		p.bookProduct(p.getCharges());
		
		System.out.println();
		
		System.out.println("Normal Account Details: ");
		n.bookProduct(n.getCharges());
		
		System.out.println();

		
		System.out.println(p);
		System.out.println(n);

		

	}

}