
package Kodnest;

public class Dog {

	private String name;
	private String breed;

	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.name="scooby";
		d1.breed="pug";
		System.out.println("details of dog 1");
		System.out.println("name:"+d1.name);
		System.out.println("breed:"+d1.breed);
		d1.bark();
		
		Dog d2=new Dog();
		d2.name="scooby";
		d2.breed="pug";
		System.out.println("details of dog 2");
		System.out.println("name:"+d2.name);
		System.out.println("breed"+d2.breed);
		d2.bark();
	}

	private void bark() {
		System.out.println("bow bow");
	}
		
	}




