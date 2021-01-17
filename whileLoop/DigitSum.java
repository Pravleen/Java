package whileLoop;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nod=(int)Math.log10(n)+1;
		int d,sum=0;
		while(n>0) {
			d=n%10;
			sum=sum+d;
			n=n/10;
		}
System.out.println("Sum is "+ sum);

System.out.println("Number of digits in a number" +nod);
	}

}
