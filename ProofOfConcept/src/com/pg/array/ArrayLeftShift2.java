package com.pg.array;

public class ArrayLeftShift2 {

	public static void main(String[] args) {
		int[] a=new int[]{1,2,3,4,5};
		System.out.println("Using Standard for loop");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Using advance for loop");
		
		for(int i:a) {
			System.out.println(i);
		}
	
	}

}
