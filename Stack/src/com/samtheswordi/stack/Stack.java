package com.samtheswordi.stack;

import java.util.HashSet;
import java.util.Set;

/**
 * @author samal Implementing Stack using Arrays.
 */
class Stack {

	public static final int MAX_SIZE = 100;
	int arr[] = new int[MAX_SIZE];
	int top;

	/**
	 * Intialize the top to -1 in constructor.
	 */
	public Stack() {
		top = -1;
	}

	/**
	 * If stack is empty return true, else return false.
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		if (top < 0)
			return true;
		else
			return false;
	}

	/**
	 * @param data
	 * @return
	 */
	public boolean push(int data) {

		if (top > MAX_SIZE) {
			System.out.println("Stack is full");
			return false;
		} else {
			arr[++top] = data;
			return true;
		}
	}

	/**
	 * @return
	 */
	public int pop() {
		int xData;
		if (top == -1) {
			System.out.println("stack is empty");
			return -1;
		} else {
			xData = arr[top--];
			return xData;
		}
	}

}

