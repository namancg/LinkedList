package com.bridgelabz.linkedlists;

public class SortedLinkedListMain {

	public static void main(String[] args) {
		LinkedList<Integer> firstNode = new LinkedList<Integer>(56);
		LinkedList<Integer> secondNode = new LinkedList<Integer>(30);
		LinkedList<Integer> thirdNode = new LinkedList<Integer>(70);
		LinkedList<Integer> extra = new LinkedList<Integer>(40);
		SortedLinkedList mySortedLinkedList = new SortedLinkedList();
		mySortedLinkedList.add(firstNode);
		mySortedLinkedList.add(secondNode);
		mySortedLinkedList.add(thirdNode);
		mySortedLinkedList.add(extra);
		mySortedLinkedList.printSortedLinkedList();
	}

}
