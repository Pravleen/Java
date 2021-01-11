package conditionalStatements;

public class IfElseIfClass {
	public static void main(String args[]) {
		int num=23;
		if(num<=10) {
			System.out.println("Number is less than 10");
			
		}
		else if(num>10 && num <=20) {
			System.out.println("Number is greater than 10 and less than 20");
		}
		else
		{
			System.out.println("Number is greater than 20");
		}
	}
}
