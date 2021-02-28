package oops.inheritence;

public class MainClass {

	public static void main(String[] args) {
		Teacher t=new Teacher("Mr ahuja");
//		t.name="Ms Ahuja";
		t.eat();
		t.teach();
		t.walk();
		Singer s=new Singer();
		s.eat();
		s.sing();
		Person p=t;//upcasting
		Person p1=new Person();
//		Teacher t1=(Teacher)p1;//downcasting
//		System.out.println(t instanceof Teacher);
//		System.out.println(t instanceof Person);
//		System.out.println(p1 instanceof Teacher);

	}

}
