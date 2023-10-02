package com;

public class StoringDuplicated {

	public static void main(String[] args) {
		int[] arr= {10,50,70,40,30,30,40,60,70};
		int[] arr1=new int[arr.length];
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					arr1[i]=arr[i];
					count++;
					break;
				}
			}
			
			}
		int[] c=new int[count];
		for(int j=0;j<=c.length-1;j++) {
			c[j]=arr1[j];
			
		}
		for(int i=0;i<=c.length-1;i++) {
			System.out.println(c[i]);
		}
		
		
		
	}

}
