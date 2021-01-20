package array;

public class ArrayIntro {
	public static void main(String args[] ){
	int[] marks=new int[10];
	System.out.println(marks[1]);
	int[] age= {12,3,4,18,5};
	double[] m= {1.0,3.5,8.9,3.4,5.5};
	
	System.out.println(m[2]);
	m[2]=5.9;
	System.out.println(m[2]);
	for(int i=0;i<age.length;i++) {
		System.out.println(age[i]);
	}
	}
}
