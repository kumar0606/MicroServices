package com.basicprograms;

public class StringDuplicates {
public static void main(String[] args) {
	String str="hello world";
	String dup="";
	String nondup="";
	for (int i = 0; i < str.length(); i++) {
		if(!nondup.contains(String.valueOf(str.charAt(i)))) {
			nondup+=String.valueOf(str.charAt(i));
		}else {
			dup+=String.valueOf(str.charAt(i));
		}
	}
}
}
