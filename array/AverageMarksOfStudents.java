package array;

import java.util.Scanner;

public class AverageMarksOfStudents {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] marks=new int[n];
		
		for(int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
			
			}
		int avg=0,sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+marks[i];
		}
		avg=sum/n;
		System.out.println("Average marks is "+avg);

	}

}
