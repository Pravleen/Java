package loops;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(); 
		boolean isPrime=true;
		if(a==1) {
			isPrime=false;
			
		}
		for(int i=2;i*i<a;i++) {
			if(a%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("Number is prime");
		}
		else {
		System.out.println("Number is not prime");	
		}
	}

}
