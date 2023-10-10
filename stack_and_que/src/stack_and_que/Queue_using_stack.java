package stack_and_que;

import java.util.Stack;

public class Queue_using_stack {
public static void main(String[] args) {
	
	
	p1();
	
}

// push opration
public static void p1() {
	Stack<Integer>s1=new Stack<>();
	Stack<Integer>s2=new Stack<>();
add(s1,20);
add(s1,34);
add(s1,31);
add(s1,90);
System.out.println(peek(s1,s2));
remove(s1,s2);
System.out.println(peek(s1,s2));
add(s1,40);
remove(s1,s2);
System.out.println(peek(s1,s2));
remove(s1,s2);
System.out.println(peek(s1,s2));
remove(s1,s2);
System.out.println(peek(s1,s2));

}

public static void add(Stack<Integer>s1,int data){
	s1.push(data);
}

public static void remove(Stack<Integer>s1,Stack<Integer>s2) {
	if(!s2.isEmpty()) {
		s2.pop();
	}else {
		while(s1.size()!=0) {
			s2.push(s1.pop());
		}
		s2.pop();
	}
}

public static int peek(Stack<Integer>s1,Stack<Integer>s2) {
	if(!s2.isEmpty()) {
		return s2.peek();
	}else {
		while(s1.size()!=0) {
			s2.push(s1.pop());
		}
		return s2.peek();
	}
}
}
