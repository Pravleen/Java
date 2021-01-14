package loops;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		float s=0;
		for(float i=1;i<=n;i++) {
			s+=(1/i);
			
		}
		System.out.println(s);
	}

}
