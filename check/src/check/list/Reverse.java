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
System.out.println(ex1(head.next));
		
	}
public static Node ex1(Node a) {
	
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
}
