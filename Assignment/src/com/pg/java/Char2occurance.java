package com.pg.java;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Char2occurance {

	public static void main(String[] args) {
		Scanner scn=null;
		String name=null;
		int count=1;
		LinkedHashMap<Character, Integer> charCount =new LinkedHashMap<>();
		//HashMap<Character, Integer> charCount =new HashMap<>();
		scn=new Scanner(System.in);
		if(scn!=null) {
			System.out.println("Enter any String:::");
			name=scn.next();
			System.out.println("String value:: "+name);
			char[] ch=name.toCharArray();
			
			for(char ch1:ch) {
				
				//Object obj=(charCount.containsKey(ch1)?((charCount.put(ch1,charCount.get(ch1)+1))):(charCount.put(ch1, 1)));
				
				if(charCount.containsKey(ch1)) {
					
					charCount.put(ch1,count);
					count=(charCount.get(ch1)+1);
				}
				else {
					charCount.put(ch1, 1);
				}
			}
			for(Map.Entry<Character, Integer> map:charCount.entrySet()) {
				System.out.println(map.getKey()+"--->"+map.getValue());
				//System.out.println(map.toString());
				System.out.println(map.getKey().toString());
			}
		}
		
	}

}
