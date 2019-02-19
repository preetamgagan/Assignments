
package com.pg.java;
//write a java program to find occurances of given String as follows::
//input:: java
//output:: j-1
//		   a-2
//         v-1 
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CharOccurance {

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		Scanner scn=null;
		String name=null;
		LinkedHashMap<Character, Integer> charCount =new LinkedHashMap<>();
		//HashMap<Character, Integer> charCount =new HashMap<>();
		scn=new Scanner(System.in);
		if(scn!=null) {
			System.out.println("Enter any String:::");
			name=scn.next();
			System.out.println("String value:: "+name);
			//name="hippopotamus";
			char[] ch=name.toCharArray();
			
			for(char ch1:ch) {
				
				Object obj=(charCount.containsKey(ch1)?((charCount.put(ch1,charCount.get(ch1)+1))):(charCount.put(ch1, 1)));
				
				/*if(charCount.containsKey(ch1)) {
					charCount.put(ch1,charCount.get(ch1)+1);
				}
				else {
					charCount.put(ch1, 1);
				}*/
			}
			for(Map.Entry<Character, Integer> map:charCount.entrySet()) {
				System.out.println(map.getKey()+"--->"+map.getValue());
			}
			long end=System.currentTimeMillis();
			//System.out.println("Performance::"+(end-start));
	
		}
		
	}

}
