package com.list.intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(-1);
		Node list=head;
	for(int i=1;i<=10;i++) {
		Node lista=new Node(i);
		list.next=lista;
		list=list.next;
	}
System.out.println(head.next+" "+list);
	}

}


