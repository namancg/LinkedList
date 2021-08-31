package com.bridgelabz.linkedlists;

public interface INode<K> {
	public K getKey();
	public void setKey(K key);
	INode getNextNode();
	public void setNextNode(INode next);
}
