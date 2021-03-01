package com.Stack.Stack;

import java.util.Scanner;


public class LinkedList{
	private int size;
	private Node head;
	
	public LinkedList() {
		size = 0;
		head = null;
	}
	
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the head
	 */
	public Node getHead() {
		return head;
	}

	/**
	 * @param head the head to set
	 */
	public void setHead(Node head) {
		this.head = head;
	}

	
	static class Node<T extends Comparable<T>>{
		private T data;
		private Node next;
		
		/**
		 * @return the data
		 */
		public T getData() {
			return data;
		}

		/**
		 * @param data the data to set
		 */
		public void setData(T data) {
			this.data = data;
		}

		/**
		 * @return the next
		 */
		public Node getNext() {
			return next;
		}

		/**
		 * @param next the next to set
		 */
		public void setNext(Node next) {
			this.next = next;
		}

		public Node(T data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
	
	/**
	 * @param <T>, the generic type that linkedlist stores
	 * @param data, the data to be stored
	 */
	public <T extends Comparable<T>> void addNodeAtFirst(T data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
		size++;
	}
	
	/**
	 * @param <T>, generic type that linkedlist stores
	 * @param data, the data tobe stored
	 */
	public <T extends Comparable<T>> void addNodeAtLast(T data) {
		Node n = new Node(data);
		Node t = head;
		if(t == null){
			head = n;
		}
		else {
			while (t.next != null)
				t = t.next;
			t.next = n;
		}
		size++;
	}
	
	/**
	 * @param data,the data that the node must contain
	 * @param index, the index at which node is to be inserted
	 * inserts a node at a particular index
	 */
	public <T extends Comparable<T>> void addNodeAtIndex(T data,int index) {
		Node n = new Node(data);
		Node t = head;
		if(index == 0) {
			addNodeAtFirst(data);
			return;
		}
		for(int i=0; i < index-1  && t!=null; i++)
			t = t.next;
		if(t == null)
		{
			System.out.println("the list is not that long, value within the specified range not given");
			return;
		}
		n.next = t.next;
		t.next = n;
		size++;
	}
	
	/**
	 * prints the linked list
	 */
	public <T> void printList() {
		Node t = head;
		System.out.print("HEAD");
		while(t!=null) {
			System.out.print(" -> " + t.data);
			t = t.next;
		}
		System.out.print(" -> null\n");
	}
	
	/**
	 * @return returns the first element of the linked list
	 */
	public <T> T returnFirst() {
		if(head == null) {
			System.out.println("No elements present");
			return null;
		}
		return (T)head.data;
	}
	
	/**
	 * deletes the first node of the list
	 */
	public <T> void pop() {
		if(head==null) {
			System.out.println("The list is empty, no elements to remove");
		}
		else {
			head = head.next;
			size--;
		}
	}
	
	/**
	 * deletes the last node of the linked list
	 */
	public <T> void popLast() {
		if(head==null) {
			System.out.println("The list is empty, no elements to remove");
		}
		else if(size == 1) {
			head = null;
			size--;
		}
		else {
			Node t = head, prev = null;
			while(t.next != null) {
				prev = t;
				t = t.next;
			}
			prev.next = null;
			size--;
		}
	}
	
	/**
	 * @param val,the data to be deleted from linked list
	 */
	public <T> void popSpecific(T val) {
		if(head==null) {
			System.out.println("The list is empty, no elements to remove");
		}
		else if(head.data.compareTo(val)==0) {
			head = head.next;
			size--;
		}
		else {
			Node t = head.next, prev = head;
			while(t != null && t.data != val) {
				prev = t;
				t = t.next;
			}
			if(t.data.compareTo(val) == 0) {
				prev.next = t.next;
				size--;
			}
			else
				System.out.println("The data is not present inside list");
		}
	}
	
	/**
	 * @param data,the data which is searched for inside linked list
	 * @return, returns true if data present in linked list, else returns false
	 */
	public <T> boolean search(T data) {
		Node n = head;
		while( n != null) {
			if(n.data.compareTo(data) == 0)
				return true;
			n = n.next;
		}
		return false;
	}
	
	/**
	 * @param toPut,the value to be put in linked list
	 * @param present, the value(already present in list) after which the data(toPut) is to be inserted
	 */
	public <T  extends Comparable<T>> void addNodeAfter(T toPut,T present) {
		Node t = head;
		while( t != null) {
			if(t.data.compareTo(present) == 0) {
				Node n = new Node(toPut);
				n.next = t.next;
				t.next = n;
				size++;
				return;
			}
			t = t.next;
		}
		System.out.println("No node with data: " + present + " exists.");
	}
}
