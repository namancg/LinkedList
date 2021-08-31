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
		
		LinkedList<Integer> Node1 = new LinkedList<Integer>(56);
		LinkedList<Integer> Node2 = new LinkedList<Integer>(30);
		LinkedList<Integer> Node3 = new LinkedList<Integer>(70);
		LinkedListImpl myLinkedList1= new LinkedListImpl();
		myLinkedList1.append(Node1);
		myLinkedList1.append(Node2);
		myLinkedList1.append(Node3);
		myLinkedList1.printLinkedList();
	}
}
