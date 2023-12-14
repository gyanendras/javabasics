package com.cgi.b3;

import java.util.LinkedList;

public class BubbleSortInt {
	 static int [] myArr = new int[5];
	
	public static void main(String[] args) {
		 myArr[0] = 3;
		 myArr[1] = 6;
		 myArr[2] = 2;
		 myArr[3] = 1;
		 myArr[4] = 5;
		 
		for(int i=0; i<5;i++) {
		 System.out.print(" "+ myArr[i]);
	} 
		
		LinkedList<Integer> ls = new LinkedList<>();
		ls.add(1);
		ls.add(2);
		ls.add(10);
		
		for(int i:ls) {
			System.out.println("\n"+i);
		}
		

}
}
