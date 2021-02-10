package oops;

class Vehicle{
	int wheels;
	String color;
	Vehicle()//no argument
	{ 
		wheels=4;
	}
//	Vehicle(int noOfWheels){parameterized
//		wheels=noOfWheels;
//		
//	}
	Vehicle(int wheels)//this keyword
	{ 
		this.wheels=wheels;
	}
	Vehicle(int wheels,String color)//constructor overloading
	{
		this.wheels=wheels;
		this.color=color;
	}
}
public class MyConstructor {
	MyConstructor(){
	System.out.println("New constructor created");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyConstructor mc=new MyConstructor();
//		Vehicle v=new Vehicle();
		Vehicle v1=new Vehicle(4);
//		System.out.println(v.wheels);
		System.out.println("Car "+ v1.wheels);
		Vehicle v2=new Vehicle(3);
		System.out.println("Tricycle "+v2.wheels);
		Vehicle eriksha=new Vehicle(3,"Yellow");
		System.out.println(eriksha.wheels+"Wheels and"+"color is"+eriksha.color);
		}

	}


