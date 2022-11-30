package abstractdemo;

public class EmployeePersonExcecutor {
	public static void main(String[] args) {
		Employee p1=new Employee("Girisha","Male",22);
		Employee p2=new Employee("Divya","Female",-6);
		
		//to return the data that we inserted
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		p1.work();
		p2.work();


	}

}


