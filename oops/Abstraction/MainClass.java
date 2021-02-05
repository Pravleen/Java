package oops.Abstraction;

public class MainClass {

	public static void repairCar(Car car) {
		System.out.println("Repair car");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WagonR w=new WagonR();
		Audi a= new Audi();
		repairCar(w);
		repairCar(a);

	}

}
