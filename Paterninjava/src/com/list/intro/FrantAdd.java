package com.list.intro;

public class FrantAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		createalist(500);
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
	Node n=new Node(v);
	n.next=a;
	return n;
}




}
