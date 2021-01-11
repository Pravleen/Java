package conditionalStatements;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12,b=8,c=10;
		int res;
		if(a>b) {
			if(a>c) {
				res=a;
			}
			else {
				res=c;
			}
		}
		else {
			if(b>c) {
				res=b;
				
			}
			else{
				res=c;
			}
		}
		System.out.println("Largest number is "+res);
	
	int r=0;
	r=a>b?a>c?a:c:b>c?b:c;
	System.out.println(r);
	}
}
