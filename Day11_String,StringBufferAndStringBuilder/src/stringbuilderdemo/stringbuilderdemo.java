package stringbuilderdemo;

public class stringbuilderdemo {

	public static void main(String[] args) {
StringBuilder s=new StringBuilder("MANOJ");//12
		
		
		//capcity method returns the current capacity
		/*The capacity is the number of charactersthat can be stored 
		(including already written characters), beyond whichan allocation will occur*/
		System.out.println(s.capacity());//by default capacity is 16+it will take length of input
		System.out.println(s.length());
		System.out.println(s.append("GIRI"));
		
		System.out.println(s.insert(2, "DODDAMANI"));
		
		System.out.println(s.capacity());//by default capacity is 16+it will take length of input
		s.setCharAt(2, 'Z');
		System.out.println(s);

	}


		
	}


