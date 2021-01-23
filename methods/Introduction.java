package methods;

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=32,sec=33;
		int m=max(first,sec);
		System.out.println(m);
		
	}
	static int max(int a,int b) {
		if(a>b)
			return a;
		else
			return b;
	}

}
