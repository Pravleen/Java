package array;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row and columns size");
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		int a[][]= new int[row][col];
		int b[][]= new int[row][col];
		System.out.println("Enter values of first matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter values of second matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				b[i][j]=sc.nextInt();				}
		}
		int c[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Resultant matrix is");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		

	}
		}

}

