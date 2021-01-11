package conditionalStatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new 	Scanner(System.in);
		System.out.println("Enter first number");
		int a =sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		int res=0;
		sc.nextLine();
		System.out.println("Enter your choice");
		char c=sc.nextLine().charAt(0);
		switch(c) {
		case '+':
			res=a+b;
			break;
		case '-':
			res=a-b;
			break;
		case '*':
			res=a*b;
			break;
		case '/':
			res=a/b;
			break;
		default:
			System.out.println("Invalid operation");
		}
		System.out.println("Result is "+res);
	}

}
