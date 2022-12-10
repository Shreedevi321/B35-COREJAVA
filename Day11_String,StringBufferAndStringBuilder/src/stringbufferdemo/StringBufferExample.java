package stringbufferdemo;

public class StringBufferExample {

	public static void main(String[] args) {
StringBuffer s=new StringBuffer("GIRISHA");//12
		
		
		//capcity method returns the current capacity
		/*The capacity is the number of charactersthat can be stored 
		(including already written characters), beyond whichan allocation will occur*/
		System.out.println(s.capacity());//by default capacity is 16+it will take length of input
		System.out.println(s.length());
		System.out.println(s.append("DODDAMANI"));
		
		System.out.println(s.insert(7, "MAHENDRA"));
		System.out.println(s.capacity());//by default capacity is 16+it will take length of input


	}


	}


