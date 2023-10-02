package com;

public class RemovingDup {

	public static void main(String[] args) {
		int[] arr= {1,1,2,2,30,50,50,80};
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				count++;
				arr[count]=arr[i];
				
			}
			System.out.println(count);
		}
		
		
		
	}

}
