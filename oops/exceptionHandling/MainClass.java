package oops.exceptionHandling;


public class MainClass {

	public static void main(String[] args) {

		fun1();
	}

	static void fun1() {
		int a=5;
		int b=3;
		int c=a/b;
		System.out.println(c);
		try {
			func2();
			Thread.sleep(1000);
			}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("After delay");
	}
	static void func2() throws ArrayIndexOutOfBoundsException{
		boolean isDanger=true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("danger was found");
		}
	}
}


