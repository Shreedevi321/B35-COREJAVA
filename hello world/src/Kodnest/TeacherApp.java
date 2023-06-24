package Kodnest;

public class TeacherApp {

	public static void main(String[] args)
	{
		Teacher t1= new Teacher("Deep","Java",25000);
		System.out.println("name:" +t1.name);
		System.out.println("sub:" +t1.sub);
		System.out.println("sal" +t1.sal);
		
		Teacher t2 =new Teacher("kushal","Aptitude",30000);
		System.out.println("name:" +t2.name );
		System.out.println("sub:" +t2.sub);
		System.out.println("sal:" +t2.sal );
		
	}

}
