package com;

public class RemovingDuplicate {

	public static void main(String[] args) {
		int[] arr= {10,30,60,60,30,60,80,90,80};
		int count=0;
		boolean[] count1=new boolean[arr.length];
		for(int i=0;i<=arr.length-1;i++) {
			if(count1[i]==false) {
				for(int j=i+1;j<=arr.length-1;j++) {		
					if(arr[i]==arr[j]) {
						count1[i]=true; 
						count++;
									
					}
				}

			}
		}
		System.out.println(count);
	}
}
