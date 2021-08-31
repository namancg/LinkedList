package com.bridgelabz.linkedlists;

public class LinkedList<K> implements INode<K>{
	private K key;
	private INode <K> next;
	public LinkedList(K key)
	{
		this.key=key;
		this.next=null;
	}
	public INode<K> getNextNode()
	{
		return next;
	}
	public void setNextNode(INode next)
	{
		this.next=next;
	}
	public K getKey()
	{
		return key;
	}
	public void setKey(K key)
	{
		this.key=key;
	}
	public void setNext(INode next)
	{
		this.next=next;
	}
	public INode<K> getNext()
	{
		return next;
	}
	public String toString()
	{
		StringBuilder myNodeString=new StringBuilder();
		myNodeString.append("{"+"Key=").append(key).append('}');
		if(next!=null)
		myNodeString.append("-->").append(next);
		return myNodeString.toString();
		
	}
}
