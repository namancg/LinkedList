package com.bridgelabz.linkedlists;

public class LinkedList<K> {
	private K key;
	private LinkedList next;
	public LinkedList(K key)
	{
		this.key=key;
		this.next=null;
	}
	public LinkedList getNextNode()
	{
		return next;
	}
	public void setNextNode(LinkedList next)
	{
		this.next=next;
	}
	public static void main(String[] args) {
		LinkedList<Integer> firstNode = new LinkedList<Integer>(56);
		LinkedList<Integer> secondNode = new LinkedList<Integer>(30);
		LinkedList<Integer> thirdNode = new LinkedList<Integer>(70);
		firstNode.setNextNode(secondNode);
		secondNode.setNextNode(thirdNode);
	}

}
