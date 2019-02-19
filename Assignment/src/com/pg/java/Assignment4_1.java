package com.pg.java;

public class Assignment4_1 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		String str="javavgh";
		int size=str.length();
		System.out.println(size/2);
		char[] ch=str.toCharArray();
		if(size%2==0) {
			for(int i=size/2;i<=size-1;i++) {
				sb.append(ch[i]);
			}
			for(int i=0;i<size/2;i++) {
				sb.append(ch[i]);
			}
			System.out.println(sb.toString());
		}
		else {
			for(int i=(size/2)+1;i<size;i++) {
				sb.append(ch[i]);
			}
			sb.append(ch[size/2]);
			for(int i=0;i<size/2;i++) {
				sb.append(ch[i]);
			}
			
			System.out.println(sb.toString());
			
		}
	}

}
