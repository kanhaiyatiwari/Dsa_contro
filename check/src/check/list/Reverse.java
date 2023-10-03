package check.list;

import com.list.intro.Node;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Node head=new Node(-1);
	Node list=head;
	for(int i=1;i<=10;i++) {
		Node newNode=new Node(i);
		list.next=newNode;
		list=list.next;
	}
System.out.println(middle(head.next));
System.out.println(deleteMiddle(head.next));	
	}
	
//	reverseList
public static Node reverse(Node a) {
	
Node current=a;
Node pre =null;
while(current!=null) {
	Node temp=current.next;
	current.next=pre;
	pre=current;
	current=temp;
}

return pre;
}

// find middle Node

public static Node middle(Node a) {
	
Node fast=a.next;
Node slow=a;
while(fast!=null&&fast.next!=null) {
	slow=slow.next;
	fast=fast.next.next;
}
return slow;
}


//delete middle node
//for this we need node befor midle also
public static Node deleteMiddle(Node a) {
	
Node fast=a.next;
Node slow=a;
Node pre=null;
while(fast!=null&&fast.next!=null) {
	pre=slow;
	slow=slow.next;
	fast=fast.next.next;
}
pre.next=pre.next.next;
return a ;
}


}
