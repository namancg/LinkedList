package com.bridgelabz.linkedlists;


public class SortedLinkedList<K extends Comparable<K>>{
	
	INode<K> head;
	INode<K> tail;
	int posOfLastNode;
	
	public SortedLinkedList() {
		head = null;
		tail = null;
		posOfLastNode = -1;
	}
	
	
	public void add(INode <K> newNode) {
		K newNodeKey = newNode.getKey();
		if(head == null) {
			head = newNode;
			tail = head;
		}
		else if(head.getKey().compareTo(newNodeKey)>0) {
			newNode.setNextNode(head);
			head = newNode;
		}
		else if(tail.getKey().compareTo(newNodeKey)<0) {
			tail.setNextNode(newNode);
			tail = newNode;
		}
		else {
			INode<K> tempPrevious = head;
			INode<K> tempCurrent = head.getNextNode();
			
			while((tempCurrent != tail) && (tempCurrent.getKey().compareTo(newNodeKey)<0)) {
				tempPrevious = tempCurrent;
				tempCurrent = tempCurrent.getNextNode();
			}
			tempPrevious.setNextNode(newNode);
			newNode.setNextNode(tempCurrent);
			
		}
		posOfLastNode++;
	}
	public K pop() {
		return pop();
	}
	
	public void remove(K key) {
		INode<K> tempCurrent = head;
		INode<K> tempPrevious = null;
		while(!tempCurrent.getKey().equals(key)) {
			tempPrevious = tempCurrent;
			tempCurrent = tempCurrent.getNextNode();
		}
		if(tempCurrent == head) {
			head = head.getNextNode();
		}
		else {
			tempPrevious.setNextNode(tempCurrent.getNextNode());
		}
		
		if(tempCurrent == tail) {
			tail = tempPrevious;
		}
		posOfLastNode--;
	}
	
	
	public int index(K key) {
		if(posOfLastNode == -1) {
			return -1;
		}
		INode<K> temporaryNode = head;
		int temporaryPosition = 0;
		while(!temporaryNode.getKey().equals(key)) {
			if(temporaryNode == tail) {
				return -1;
			}
			temporaryNode = temporaryNode.getNextNode();
			temporaryPosition++;
		}
		return temporaryPosition;
	}
	
	
	public boolean search(K key) {
		if(index(key) == -1)
		{
			return true;
		}
		else
			return false;
	}
	
	
	public boolean isEmpty() {
		if(posOfLastNode==-1)
		{
			return true;
		}
		else
			return false;
	}
	
	
	public int size() {
		return posOfLastNode+1;
	}

	
	public void printSortedLinkedList() {
		System.out.println("My Nodes: " + head);
	}
}
