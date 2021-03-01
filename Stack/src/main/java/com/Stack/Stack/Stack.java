package com.Stack.Stack;

public class Stack{
	private LinkedList stack;
	/**
	 * @return the top
	 */
	public LinkedList.Node getTop() {
		return top;
	}

	/**
	 * @param top the top to set
	 */
	public void setTop(LinkedList.Node top) {
		this.top = top;
	}

	/**
	 * @return the stack
	 */
	public LinkedList getStack() {
		return stack;
	}

	/**
	 * @param stack the stack to set
	 */
	public void setStack(LinkedList stack) {
		this.stack = stack;
	}

	LinkedList.Node top;
	
	/**
	 * @param stack
	 */
	public Stack() {
		stack = new LinkedList();
		top = null;
	}

	public<T extends Comparable<T>> void push(T data) {
		stack.addNodeAtFirst(data);
		top = stack.getHead();
	}
	
	public void printStack() {
		System.out.println("The stack is as follows");
		stack.printList();
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(40);
		stack.push(5);
		stack.printStack();
	}
}
