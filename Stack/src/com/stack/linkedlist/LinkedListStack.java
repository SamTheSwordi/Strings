package com.stack.linkedlist;

public class LinkedListStack {
	
	LinkedList list = new LinkedList();
	
	public void push (int data) {
		list.insertFirst(data);
	}
	
	public void pop () {
		if (!list.isEmpty()) {
			list.deleteFirst();
		}
	}
	
	public void displayStack () {
		list.print();
	}

}
