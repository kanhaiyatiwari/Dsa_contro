package com.list.intro;

public class Node{
	public int data;
	public Node next;
	public Node() {
		super();
		this.data = 0;
		this.next = null;
	}
	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	
}