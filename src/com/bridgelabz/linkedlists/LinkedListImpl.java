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
	public INode search(int key)
	{
		INode tempNode=head;
		while(tempNode!=null) {
			if(tempNode.getKey().equals(key)) {
				return tempNode;
					}
			tempNode=tempNode.getNextNode();}
		return tempNode;
	}
	public void insertWithKeyValue(int key, INode newNode)
	{
		INode nodeWithKeyValue = search(key);
		if(nodeWithKeyValue.getKey().equals(key))
		{
			INode tempNode = nodeWithKeyValue.getNextNode();
			nodeWithKeyValue.setNextNode(newNode);
			newNode.setNextNode(tempNode);
		}
		else
		{
			System.out.println("Enter valid key");
		}
		
	}
	public INode deleteWithKey(int key)
	{
		INode nodeWithKeyValue = search(key);
		if(nodeWithKeyValue !=null)
		{
			INode tempNode=head;
			while (tempNode!=null && tempNode.getNextNode()!= nodeWithKeyValue)
			{
				tempNode=tempNode.getNextNode();
			}
			tempNode.setNextNode(nodeWithKeyValue.getNextNode());
			return nodeWithKeyValue;}
		else
		{
			return null;
		}
		
	}
	public int size()
	{
		int intialNumberOfNodes=0;
		INode tempNode = this.head;
		while(tempNode !=null)
		{
			tempNode =tempNode.getNextNode();
			intialNumberOfNodes++;
		}return intialNumberOfNodes;
	}
	public void printLinkedList()
	{
		System.out.println(head);
	}
}
