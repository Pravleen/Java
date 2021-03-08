package deque;

import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		ad.addFirst(5);
		ad.addFirst(10);
		
		ad.addLast(20);
		Mydeque<Integer> md=new Mydeque<>();
		md.toAddHead(7);
		System.out.println(md.toRemovelast());
		

	}

}
