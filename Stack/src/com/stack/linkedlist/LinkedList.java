package com.stack.linkedlist;



/**
 * @author samal
 *
 */
public class LinkedList {
	Node head;
	
	/**
	 * @author samal
	 *
	 */
	static class Node {
		int data;
		Node next;
		
		Node (int data){
			this.data = data;
			this.next = null;
		}
		
		/**
		 * 
		 */
		public void displayNode () {
			System.out.println(data + " ");
		}
	}
	
	/**
	 * @param data
	 */
	public void insertFirst (int data) {
	
		Node n = new Node (data);
		n.next = head;
		head = n;
	}
	
	/**
	 * @return
	 */
	public Node deleteFirst () {
		Node temp = head;
		head = head.next;
		return temp;
	}
	
	/**
	 * 
	 */
	public void print() {
		Node current = head;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
	}
		
	/**
	 * @return
	 */
	public boolean isEmpty () {
		return (head == null);
	}
		
		
}

