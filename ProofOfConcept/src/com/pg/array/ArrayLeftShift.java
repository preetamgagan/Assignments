package com.pg.array;

import java.util.Arrays;

public class ArrayLeftShift {

	public static void main(String[] args) {
		int[] a=new int[]{1,2,3,4,5};
		System.out.println(Arrays.toString(rotLeft(a, 1)));
	}
	 static int[] rotLeft(int[] a, int d) {
			 int[] temp=new int[a.length];
			 for(int i = 0; i < a.length; i++){
				 int newLocation = (i + (a.length - d)) % a.length;
				 System.out.println(newLocation);
				 temp[newLocation] = a[i];
			 }
			 return temp;
         
	       /* int[] temp=new int[a.length];
	        while(d>0){
	            temp[a.length-1]=a[0];
	            for(int i=0;i<a.length-1;i++){
	                temp[i]=a[i+1];
	            }
	 
	         for(int i=0;i<temp.length;i++)
	                a[i]=temp[i];
	            
	            for(int i=0;i<temp.length;i++)
	                temp[i] = 0;
	            
	            d--;
	        }
	        return a;*/

	    }

}
