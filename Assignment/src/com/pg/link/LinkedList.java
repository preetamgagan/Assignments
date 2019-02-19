package com.pg.link;

import java.util.ArrayList;
import java.util.HashMap;

public class LinkedList {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		int size=al.size();
		System.out.println("Middle Element is:: "+((size%2==0)?((al.size()/2))+" "+((al.size()/2)+1):((al.size()/2)+1)));

		/*if(size%2==0) {
			System.out.println("Even number of entries are in arraylist");
			System.out.println("Middle Element is::"+((al.size()/2))+" "+((al.size()/2)+1));
		}
		else {
			System.out.println("Odd number of entries are in arraylist");
			System.out.println("Middle Element is::"+((al.size()/2)+1));
		}
		*/
	}

}
