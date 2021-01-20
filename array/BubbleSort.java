package array;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {2,1,8,-3,6,4,12};
		for(int i=0;i<a.length-1;i++) {
			boolean sorted=true;
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					sorted=false;
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			if(sorted) {
				break;
			}
		}
		for(int item:a) {
		System.out.print(item+" ");

	}
	}
}
