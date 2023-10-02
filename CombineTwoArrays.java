package com;

public class CombineTwoArrays {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		int [] x=ao.readArray();
		System.out.println("User entered array");
		ao.dispArray(x);
		System.out.println();
		int [] y=ao.readArray();
		System.out.println("User entered array");
		ao.dispArray(y);
		System.out.println();
		int[]z= combineArr(x,y);
		System.out.println("After combine array elements are:");
		ao.dispArray(z);
	}
	static int[] combineArr(int[] a,int[] b) {
		int[] m=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			m[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			m[i+a.length]=b[i];
		}

		return m;
	}

}

