package conditionalStatements;

public class SwitchCaseStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dayOfWeek=2;
		switch(dayOfWeek) {
		//merge 2 case statement
		case 1:
		case 2:
			System.out.println("I am on leave");
			break;
//		case 2:
//			System.out.println("I am working");
//			break;
		case 3:
			System.out.println("I am playing football");
			break;
		case 4:
			System.out.println("I am in office");
			break;
		default:
			System.out.println("Invalid choice");
		}
		
	}

}
