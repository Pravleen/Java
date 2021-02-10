package oops;
class Cat{
	boolean hasFur;
	String color;
	String breed;
	int legs,eyes;
	public void walk() {
		System.out.println("Cat is walking");
	}
	public void eat() {
		System.out.println("Cat is eating");
	}
	public void describe() {
		System.out.println("My cat has legs "+legs);
		System.out.println("Eyes"+eyes);
	}
}
public class MainClass {

	public static void main(String[] args) {
		Cat c1=new Cat();
		c1.walk();
		c1.legs=4;
		c1.eyes=2;
		Cat c2=new Cat();
		c2.eat();
		c1.describe();
		

	}

}
