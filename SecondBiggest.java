package com;

public class SecondBiggest {

	public static void main(String[] args) {
		int[] arr= {10,20,40,60,99,100};
		
		int big=Integer.MIN_VALUE;
		int sbig=Integer.MAX_VALUE;
		
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>big) {
				sbig=big;
				big=arr[i];
			}
			if(arr[i]>sbig&& arr[i]<big) {
				sbig=arr[i];
			}
			
		}
		System.out.println("First biggest number :"+big);
		System.out.println("Second biggest number : "+sbig);

	}

}
