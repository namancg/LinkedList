package com.bridgelabz.linkedlists;

public class LinkedListImpl {
	private INode head;
	private INode tail;
	public LinkedListImpl()
	{
		this.head=null;
		this.tail=null;
	}
	public void add(INode newNode)
	{
		if(this.head==null )
		{
			this.head=newNode;
		}
		if(this.tail==null)
		{
			this.tail=newNode;
		}
		else
		{
			INode tempNode=this.head;
			this.head=newNode;
			this.head.setNextNode(tempNode);
		}
		
	}
	public void append(INode newNode)
	{
		if(this.head==null )
		{
			this.head=newNode;
		}
		if(this.tail==null)
		{
			this.tail=newNode;
		}
		else
		{
			INode tempNode1=this.head;
			this.tail.setNextNode(newNode);
			this.tail=newNode;
			
		}
		
	}
	public void insert(INode newNode,INode prevNode)
	{
		INode tempNode=prevNode.getNextNode();
		prevNode.setNextNode(newNode);
		newNode.setNextNode(tempNode);
	}
	public INode delete()
	{
		INode tempNode=this.head;
		this.head=this.head.getNextNode();
		return tempNode; 
	}
	public INode deleteLast() 
	{
		INode tempNode =head;
		while(!tempNode.getNextNode().equals(tail)) {
			tempNode = tempNode.getNextNode();
		}
		this.tail=tempNode;
		tempNode=tempNode.getNextNode();
		this.tail.setNextNode(null);
		return tempNode;
	}
	public void printLinkedList()
	{
		System.out.println(head);
	}
}
