package conditionalStatements;

import java.util.Scanner;

public class RtingSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your rating");
		int c=sc.nextInt();
		switch(c){
			case 1:
			case 2: 
				System.out.println("Bad");
				break;
			case 3: 
				System.out.println("Average");
				break;
			case 4:
			case 5:
				System.out.println("Good");
				break;
			default:
				System.out.println("Invalid rating");
	}
	}
}
