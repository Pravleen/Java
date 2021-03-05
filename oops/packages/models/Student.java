package oops.packages.models;

public class Student {
	private String name;//it can't be accessed outside the class
	Student(String name){
		this.name=name;
	}
	public String getName() {
		return name;
		
	}

}
