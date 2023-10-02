package com;

import java.util.Scanner;

public class ArrayOperation {
		
int[]	readArray(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("enter the "+n+" values:");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
return ar;
}
void dispArray(int[] ar) {
	for(int i=0;i<ar.length;i++) {
		System.out.print(ar[i]+" ");
	}
}
public static void main(String[] args) {
	ArrayOperation ao=new ArrayOperation();
	int [] x=ao.readArray();
	System.out.println("User entered array elements:");
	ao.dispArray(x);
}

}