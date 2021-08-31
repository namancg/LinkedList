package com.bridgelabz.linkedlists;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList<Integer> firstNode = new LinkedList<Integer>(56);
		LinkedList<Integer> secondNode = new LinkedList<Integer>(30);
		LinkedList<Integer> thirdNode = new LinkedList<Integer>(70);
		LinkedListImpl myLinkedList= new LinkedListImpl();
		myLinkedList.add(firstNode);
		//myLinkedList.add(secondNode);
		myLinkedList.append(thirdNode);
		myLinkedList.insert(secondNode, firstNode);
		myLinkedList.printLinkedList();
		INode delete=myLinkedList.delete();
		System.out.println("AFTER DELETING:");
		myLinkedList.printLinkedList();
	
}
}
