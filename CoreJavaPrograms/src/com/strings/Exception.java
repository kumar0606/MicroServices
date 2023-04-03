package com.strings;

public class Exception {
public static void main(String[] args) {
	
	int arr[]=new int [5];
	try {
	System.out.println(arr[6]=40);
	}catch(ArrayIndexOutOfBoundsException e) {
		//System.out.println(e.printStackTrace());
	}
	System.out.println(1.5/0);
}
}
