package com;

public class RemoveArr {

	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
	int[] arr=	ao.readArray();
		ao.dispArray(arr);
	int[] z=removeArray(arr,1);
	}
	static int[] removeArray(int[] arr,int in){
		if(in<0||in>=arr.length) {
			System.out.println("array out of length!!");
			return arr;
		}
		int[] brr=new int[arr.length-1];
		for(int i=0;i<=brr.length-1;i++) {
			if(i<in) {
				brr[i]=arr[i];	
			}
			else {
				brr[i]=arr[i+1];
			}
		}
		return brr;
	}

}
