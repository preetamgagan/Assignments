package com.pg.java;
/*write a java program to exchange first half string value to second half String value
ex: input:: java			ex:	input:: program
	output:: vaja				output:: ramgpro*/

public class Assignment4{
	public static void main(String[] args) {
		String str="java";
		int size=str.length();
		int h=0;
		System.out.println((size%2==0)?(str.substring(size/2,size)+str.substring(0, size/2)):
			str.substring(size/2+1,size)+str.substring(size/2,size/2+1)+str.substring(0, size/2));
		
		System.out.println("==============================");
		System.out.println(Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
		System.out.println(Math.max(-24, -49));
		System.out.println(h>49);
		System.out.println(h>-49);
	}//main
}//class

