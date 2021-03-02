package oops.interfaces;

//public class Person extends Student,Youtuber not supported in java
public class Person implements Student,Youtuber{
	public static void main(String args[]) {
		Person obj=new Person();
		Youtuber obj1=obj;
		obj.study();
		obj.makeVideo();
		obj1.editVideo();
		obj1.makeVideo();
		
	}

	public void study() {
		// TODO Auto-generated method stub
		System.out.println("Person is studying");
		
	}

	public void makeVideo() {
		// TODO Auto-generated method stub
		System.out.println("Person is making a video");
	}

//	@Override
//	public void editVideo() {
//		// TODO Auto-generated method stub
//		System.out.println("Person is editing a video");
//	}

}
