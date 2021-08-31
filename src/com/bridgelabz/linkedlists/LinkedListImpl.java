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
	public void printLinkedList()
	{
		System.out.println(head);
	}
}
