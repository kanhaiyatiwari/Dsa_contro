package com.pattern.Number;

public class Patern1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		p3();

	}
	public static void p1() {
		/*1
		12
		123
		1234
		12345
		123456*/
		String bag="";
		for(int i=1;i<7;i++) {
			bag+=i+"";
			System.out.println(bag);
		}
	}

	public static void p2() {
	/*  1
		22
		333
		4444
		55555
		666666*/
		String bag="";
		for(int i=1;i<7;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void p3() {
		
			StringBuilder s=new StringBuilder ("      ");
			
			for(int i=s.length()-1;i>=0;i--) {
				s.setCharAt(i, '*');
				System.out.println(s.toString());
			}
		
		}
	

}