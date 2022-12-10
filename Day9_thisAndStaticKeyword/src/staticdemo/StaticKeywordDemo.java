package staticdemo;

public class StaticKeywordDemo {

	//static variable
			static int a;
			float b;
			
			//static method
			public static  void accept()
			{
				System.out.println("Shreedevi prabhu");
			}
			//static block is used to initialize static data members
			static
			{
				a=26;
				//we can't use non static variable inside static block
				//b=89;
			}

	

	}


