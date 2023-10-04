package check.list.mergeAndSort;

import com.list.intro.Node;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(merge(Node1()));
	}
	
	public static Node merge(Node list) {
        
		if(list.next==null) {
			
			return list ;
		}
		
		
		
		Node midle=midlle(list);
		Node current=midle.next;
		midle.next=null;
		Node left =merge(list);
		Node right=merge(current);
	Node mm=	merge.mergeList(left, right);
	return mm;
		
	}
	
	public static Node midlle(Node a) {
		
		Node slow=a;
		Node fast=a.next;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}

	//list1
	public static Node Node1() {
		Node head=new Node(1);
		Node list1=new Node(0);
		
		Node list2=new Node(5);
		Node list3=new Node(3);
		Node list4=new Node(6);
		Node list5=new Node(2);
		
		Node list6=new Node(9);
		
		Node list7=new Node(3);
		Node list8=new Node(0);
		Node list9=new Node(12);
		Node list10=new Node(11);

		head.next=list1;
		list1.next=list2;
		list2.next=list3;
		list3.next=list4;
		list4.next=list5;
		list5.next=list6;
		list6.next=list7;
		list7.next=list8;
		list8.next=list9;
		list9.next=list10;
		return head;
	}


	
	}
