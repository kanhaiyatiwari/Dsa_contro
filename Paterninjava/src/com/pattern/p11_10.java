package com.pattern;

public class p11_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	    *
		   ***
		  *****
		 *******
		*********
*/
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<(i*2);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		rev();
		System.out.println("---");
		p2();
	}
	
public static void rev() {
 
	int n=5;
	for(int j=n-1;j>=1;j--) {
		for(int i=n;i>j;i--) {
			System.out.print(" ");
		}
		for(int i=1;i<=(j*2)-1;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}

public static void p2() {
//    *
//   * *
//  *   *
// *     *
//********* 
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=n-1;j>=i;j--) {
			System.out.print(" ");
		}
		for(int j=1;j<(i*2);j++) {
			if(j==1||j==(i*2)-1||i==n)
			System.out.print("*");
			else 
				System.out.print(" ");
		}
		System.out.println();
	}
}
}



