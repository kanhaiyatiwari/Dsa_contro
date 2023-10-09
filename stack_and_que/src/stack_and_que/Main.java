package stack_and_que;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		
//		implement stack using queb;
		
		Queue<Integer>q1=new LinkedList<>();
		Queue<Integer>q2=new LinkedList<>();
		
		 push(q1,q2,2);
		 push(q1,q2,3);

		 push(q1,q2,4);

		 push(q1,q2,6);
		 pop(q1);
		 
System.out.println(peek(q1));
	}
	
	public static void push(Queue<Integer>q1,Queue<Integer>q2,int data) {
		q2.add(data);
		
		while(q1.size()!=0) {
			q2.add(q1.peek());
			q1.remove();
			
		}
		
		while(q2.size()!=0) {
			q1.add(q2.peek());
			q2.remove();
			
		}
	}
	
public static void pop(Queue<Integer>q1) {
		q1.remove();
	}

public static int peek(Queue<Integer>q1) {
	return q1.peek();
}

}
