package array;

public class SelectionSort {

	public static void main(String[] args) {
		int a[]= {3,1,-2,7,4,0};
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			int pos=i;
			for(int j=i;j<n;j++) {
				if(a[pos]>a[j]) {
					pos=j;
				}
			}
			int temp=a[i];
			a[i]=a[pos];
			a[pos]=temp;
		}
		for(int item:a) {
			System.out.print(item+" ");
		}

	}

}
