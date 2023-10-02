package com;

public class SecondSmalllest {

	public static void main(String[] args) {
		int[] arr= {10,5,100,50,80,90};
		int small=Integer.MAX_VALUE;
		int ssmall=Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]<small) {
				ssmall=small;
				small=arr[i];
			}
			if(arr[i]<small&&small>ssmall) {
				ssmall=arr[i];
			}
			
		}
		System.out.println(ssmall);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
