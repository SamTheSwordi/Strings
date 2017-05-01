package com.stack.linkedlist;

/**
 * @author samal
 *
 */
public class LinkedListStackTest {
	
	public static void main(String[] args) {
		LinkedListStack linkedListStack = new LinkedListStack();
		linkedListStack.push(10);
		linkedListStack.push(20);
		linkedListStack.push(30);
		linkedListStack.displayStack();
		
		linkedListStack.pop();
		linkedListStack.displayStack();
		
	}

}
