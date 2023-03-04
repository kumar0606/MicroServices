package com.basicprograms;

public class FibonacciNumber {
public static void main(String[] args) {
	int num=10;
	int num1=1;
	int num2=0;
	while(num1<num) {
		System.out.println(num2);
		int num3=num1+num2;
		num1=num2;
		num2=num3;
	}
}
}
