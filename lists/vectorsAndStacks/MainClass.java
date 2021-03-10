package lists.vectorsAndStacks;

import java.util.*;

public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<Integer>();
		v.add(12);
		System.out.println(v);
		Stack<Integer> s=new Stack<>();
		s.push(20);
		s.push(24);
		s.push(5);
		int s1=s.pop();
		System.out.println(s1);
		System.out.println(s.peek());
		System.out.println(s);
		MyStack<String> ss=new MyStack<>();
		ss.push("4");
		System.out.println( ss.pop());
		System.out.println( ss.pop());
		
		
		

	}

}
