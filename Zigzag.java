package com;

public class Zigzag {
public static void main(String[] args) {
	int[] a= {10,20,40,60,90};
	int[] b= {20,50,80,90,100};
	
	int[] c=zigZag(a,b);
	for(int i=0;i<=c.length-1;i++) {
		System.out.print(c[i]+" ");
	}
}

static int[]  zigZag(int[] a,int[] b) {
	int [] cc= new int[a.length+b.length];
	int i=0,j=0;
	while(i<a.length&&i<b.length) {
		cc[j]=a[i];
		j++;
		cc[j]=b[i];
		j++;
		i++;
	}
	while(i<a.length) {
		cc[j]=a[i];
		j++;
		i++;
	}
	while(i<a.length) {
		cc[j]=b[i];
		j++;
		i++;
	}
	return cc;
}
}
