package lists.vectorsAndStacks;

import lists.linkedList.MyLinkedList;

public class MyStack<E> {
	private MyLinkedList<E> ll=new MyLinkedList<>();
	void push(E e) {
		ll.add(e);
	}
	E pop() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("Popping from empty stack");
			
		}
		return ll.removeList();
		
	}
	E peek() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("Peeing from empty stack");
			
		}
		return ll.getLast();
		
	}

}
