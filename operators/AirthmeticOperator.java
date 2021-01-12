package operators;

public class AirthmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=23;
		int b=45;
		int c=a+b;
		
		System.out.println(c);
		int d=a*b;
		System.out.println(d);
		int e= a*a + b*b+2*a*b;
		int j=(a+b)*(a+b);
		System.out.println(e);
		System.out.println(j);
		int div=b/a;
		System.out.println(div);
		double div1=b/a;
		System.out.println(div1);
		double div2=(double)b/(double)a;
		System.out.println(div2);
		int mod=b%a;
		System.out.println(mod);
		double mod1=b%a;
		System.out.println(mod1);
		int g=b++;
		System.out.println(g+" "+b);
	}

}
