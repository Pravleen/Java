package operators;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=45;
		if (number>=1 && number <=100) {
			System.out.println("Number is between 1 and 100");
		}
		else
		{
			System.out.println("Number out of range");
		}
	

	int grade=10;
	if (grade==10 || grade==12) {
		System.out.println("Board year");
	}
	else
	{
		System.out.println("Not board class");
	}
}
}