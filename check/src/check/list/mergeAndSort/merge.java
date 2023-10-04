package check.list.mergeAndSort;

import com.list.intro.Node;

public class merge {
public static void main(String[] args) {
	
	System.out.println(mergeList(Node1(),Node2()));
}

//list1
public static Node Node1() {
	Node head=new Node(2);
	Node list1=new Node(4);
	
	Node list2=new Node(7);
	Node list3=new Node(8);
	Node list4=new Node(10);
	Node list5=new Node(12);

	head.next=list1;
	list1.next=list2;
	list2.next=list3;
	list3.next=list4;
	list4.next=list5;
	return head;
}


public static Node Node2() {
	Node head=new Node(0);
	Node list1=new Node(5);
	
	Node list2=new Node(6);
	Node list3=new Node(12);
	Node list4=new Node(13);
	Node list5=new Node(20);

	head.next=list1;
	list1.next=list2;
	list2.next=list3;
	list3.next=list4;
	list4.next=list5;
	return head;
}

public  static Node mergeList(Node list1,Node list2) {
	
	Node head=new Node(-1);
	Node ans=head;
	while(list1!=null&&list2!=null) {
//		ans.next=list1;
//		list1=list1.next;
//		ans=ans.next;
		if(list1.data<list2.data) {
			ans.next=list1;
			list1=list1.next;
			ans=ans.next;
		}else {
			ans.next=list2;
			list2=list2.next;
			ans=ans.next;
		}
	}
	
	while(list1!=null) {
		ans.next=list1;
		list1=list1.next;
		ans=ans.next;
	}
	
	while(list2!=null) {
		ans.next=list2;
		list2=list2.next;
		ans=ans.next;
	}
	return head.next;
}

}
