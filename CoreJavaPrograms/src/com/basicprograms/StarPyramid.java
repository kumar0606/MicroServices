package com.basicprograms;

public class StarPyramid {
public static void main(String[] args) {
	int num=10;
	for(int i=0;i<=num;i++) {
		for (int j = num-i; j >=0; j--) {
			System.out.print(" ");
		}
		for (int j = 0; j <=i; j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
