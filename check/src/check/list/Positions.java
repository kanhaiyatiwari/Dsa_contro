package check.list;

import com.list.intro.Node;

public class Positions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Node head=new Node(-1);
Node list=head;
for(int i=1;i<=10;i++) {
	Node newNode=new Node(i);
	list.next=newNode;
	list=list.next;
}
System.out.println(position(head.next,5));
System.out.println(Deleteposition(head.next,5));

	}
	//return the node by givin position;
public static Node position(Node a,int p) {
	Node current=a;
	int index=1;
	if(a==null) {
		throw new NullPointerException("list value is null");
	}
	if(p==0) {
		return a;
	}
	while(index<p&&current!=null) {
		current=current.next;
		index+=1;
	}
	return current;
}

public static Node Deleteposition(Node a,int p) {
	Node current=a;
	int index=1;
	if(a==null) {
		throw new NullPointerException("list value is null");
	}
	if(p==0) {
		return a;
	}
	while(index<p-1&&current!=null) {
		current=current.next;
		index+=1;
	}
	current.next=current.next.next;
	return a;
}


}
