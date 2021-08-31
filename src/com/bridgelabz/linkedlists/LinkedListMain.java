package com.bridgelabz.linkedlists;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList<Integer> firstNode = new LinkedList<Integer>(56);
		LinkedList<Integer> secondNode = new LinkedList<Integer>(30);
		LinkedList<Integer> thirdNode = new LinkedList<Integer>(70);
		LinkedList<Integer> nodeToBeInserted = new LinkedList<Integer>(40);
		LinkedListImpl myLinkedList= new LinkedListImpl();
		int node=30;
		myLinkedList.add(firstNode);
		//myLinkedList.add(secondNode);
		myLinkedList.append(thirdNode);
		myLinkedList.insert(secondNode, firstNode);
		myLinkedList.insertWithKeyValue(node, nodeToBeInserted);;
		INode deleteNode=myLinkedList.deleteWithKey(40);
		myLinkedList.printLinkedList();
		int size=myLinkedList.size();
		myLinkedList.printLinkedList();
		System.out.println(size);
		
		
	
}
}
