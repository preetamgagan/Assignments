package com.pg.java;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner scn=null;
		String name=null;
		Character c='\u0000';
		int count=49;
		scn=new Scanner(System.in);
		if(scn!=null) {
			name="prppehippopptppappmpp";
			/*System.out.println("Enter any String:::");
			name=scn.next();
			System.out.println("String value:: "+name);*/
			//System.out.println("Enter  character to find occurance::");
			//c=scn.next().charAt(0);
			c='p';
			System.out.println("String character:: "+c);
			char[] ch=name.toCharArray();
			System.out.println(ch.length);
			for(int i=0;i<ch.length;i++) {
				if(name.charAt(i)==c) {
					ch[i]=(char)count++;
				}
			
				
			}
			System.out.println(Arrays.toString(ch));
		}
		
	}

}
