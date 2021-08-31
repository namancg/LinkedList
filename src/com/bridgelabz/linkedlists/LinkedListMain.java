package com.bridgelabz.linkedlists;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList<Integer> firstNode = new LinkedList<Integer>(70);
		LinkedList<Integer> secondNode = new LinkedList<Integer>(30);
		LinkedList<Integer> thirdNode = new LinkedList<Integer>(56);
		LinkedListImpl myLinkedList= new LinkedListImpl();
		myLinkedList.add(firstNode);
		myLinkedList.add(secondNode);
		myLinkedList.add(thirdNode);
		myLinkedList.printLinkedList();
		
	}
}
