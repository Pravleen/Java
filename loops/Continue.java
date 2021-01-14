package loops;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++) {
			if(i<=60 && i>=40) {
				continue;
			}
			else
				System.out.println(i);
		}
	}

}
