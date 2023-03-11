package com.collections;

import java.util.Arrays;
import java.util.List;

public class Convert_Array_Collection {
public static void main(String[] args) {
	String arr[]= {"monday","tuesday","wednesday","thursday","friday"};
	int arraylen=arr.length;
	for (int i = 0; i < arraylen; i++) {
		System.out.println(arr[i]+" ");
	}
	
	List convertlist=Arrays.asList(arr);
	System.out.println(convertlist);
}
}
