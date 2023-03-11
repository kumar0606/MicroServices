package com.collections;

public class Odd {
public static void main(String[] args) {
	int arr[]= {40,41,42,43,44,45,46,47,48,49,50};
	//int len=arr.length;
	for (int i = 0; i <arr.length; i++) {
		if(arr[i]%2!=0) {
			System.out.println(arr[i]);
		}
	}
}
}
