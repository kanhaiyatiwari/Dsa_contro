package check.list;

import com.list.intro.Node;

public class linkedListCycle {
public static void main(String[] args) {
	Node head=new Node(-1);
	Node curent=head;
	Node list=head;
	for(int i=1;i<=10;i++) {
		Node newNode=new Node(i);
		list.next=newNode;
		list=list.next;
	}
	while(curent.next!=null) {
		
		curent=curent.next;
	}
	curent.next=head;
	System.out.println(cycle(head));

}

public static boolean  cycle(Node a) {
	Node fast=a.next;
	Node slow=a;
	while(fast!=null&& fast.next!=null) {
		if(slow==fast) {
			return true;
		}
		slow=slow.next;
		fast=fast.next.next;
	}
	return false;
}
}
