/* Write a java program to read below 2 inputs
 * 1) read integer array values- {1,8,9,5,4,2,7}
 * 2) read one integer number- 9
 * 
 *  1+8=9
 *  5+4=9
 *  2+7=9 
 *  
 *  O/P : 1,8   5,4   2,7
 */
package com.pg.array;

public class TwoNoSumIs9 {

	public static void main(String[] args) {
		int[] userArray=new int[]{1,8,9,5,4,2,7};
		
			for(int i=0;i<userArray.length;i++) {
				for(int j=i+1;j<userArray.length;j++) {
					if((userArray[i]+userArray[j])==9) {
						System.out.print(userArray[i]+","+userArray[j]+"    ");
					}
				}
			}
		
	}

}
