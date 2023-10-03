package com.list.intro;

public class LastAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createalist( 20);
	}
	public static void createalist(int v) {
		
		Node head=new Node(-1);
		Node list=head;
		for(int i=1;i<=5;i++) {
			Node lista=new Node(i);
			list.next=lista;
			list=list.next;
		}
		System.out.println(solve(head.next,v));
	}


	private static Node solve(Node a,int v) {
		// TODO Auto-generated method stub
		Node temp=a;
		while(temp.next!=null) {
			temp=temp.next;
		}
		Node ele=new Node(v);
		temp.next=ele;
		return a;
	}



}
