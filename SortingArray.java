package com;

public class SortingArray {
//[0,0,1,1,1,2,2,3,3,4]
	public static void main(String[] args) {
		int[] arr= {10,30,60,3,60,10,50,100};
	int[] a =	sort(arr);
	int b	=removeDup(a);
	System.out.println(b);
	}
	static int[] sort(int[] arr) {
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++ ) {
				int temp=0;
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
		
	}
	static int removeDup(int[] arr) {
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					continue;
				}
				else {
					if(arr[i]!=arr[j]) {
						arr[count]=arr[i];
					}
				}
			}
		}
		return count;
	}

}
