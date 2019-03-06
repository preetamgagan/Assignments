package com.pg.array;


public class AscendingOrder {

	public static void main(String[] args) {
		int[] a=new int[] {1,3,5,2,4,6,7};
		/*for(int i=0;i<a.length;i++) {
			a[i]=new Random().nextInt(9);
			System.out.println(a[i]);
		}*/
		int temp=0;
		for(int i:a)System.out.print(i);
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
					
			}
			
		}
		System.out.println("Ascending Order");
		for(int i:a)System.out.print(i);

	}

}
