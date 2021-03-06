package oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dog d=new Dog();
//		Pet p=d;
//		Animal a=d;
//		
//		d.walk();
//		p.walk();// run time polymorphism
		greetings();
		greetings("Pravleen");//compile time polymorphism
		
	}
	public static void greetings() {
		System.out.println("Hi, there");
	}
	public static void greetings(String s) {
		System.out.println("Hi, there "+s);
	}

}
