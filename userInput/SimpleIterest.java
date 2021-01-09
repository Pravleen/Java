package userInput;

import java.util.Scanner;

public class SimpleIterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int p=5000;
//		float rate =12.5f;
//		int time=12;
//		float si=(p*rate*time)/100;
//		System.out.print(si);
		
		//User input
		Scanner sc= new Scanner(System.in); 
		int p=sc.nextInt();
		float rate =sc.nextFloat();
		int time=sc.nextInt();
		float si=(p*rate*time)/100;
		System.out.print(si);
	}

}
