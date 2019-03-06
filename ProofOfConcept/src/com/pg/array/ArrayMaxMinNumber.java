/* Write a java program to read below inputs
 *   {1,5,7,9,35,95,78}
 *   
 *   Write a logic to print min and max number without sorting the array
 */

package com.pg.array;

import java.util.Scanner;

public class ArrayMaxMinNumber {

	public static void main(String[] args) {
		Scanner scn = null;
		int minNumber=Integer.MAX_VALUE;
		int maxNumber=Integer.MIN_VALUE;
		int size=0;
		int[] userArray=null;
		scn=new Scanner(System.in);
		System.out.println("Enter the size of Array you want :: ");
		size=scn.nextInt();
		userArray=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter "+i+" index number :: ");
			userArray[i]=scn.nextInt();
		}
		for(int ele:userArray)System.out.print(ele+"  ");
		System.out.println();
		for(int i=0;i<userArray.length;i++) {
			if(maxNumber<userArray[i])
				maxNumber=userArray[i];
			if(minNumber>userArray[i])
				minNumber=userArray[i];
		}
		System.out.println("Max Number is : "+maxNumber);
		System.out.println("Min Number is : "+minNumber);

		scn.close();






















	}

}
