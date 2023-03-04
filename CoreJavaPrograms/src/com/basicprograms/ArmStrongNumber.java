package com.basicprograms;

public class ArmStrongNumber {
public static void main(String[] args) {
	int num=153;
	int org=num;
	int sum=0;
	int rem;
	while(num>0) {
		rem=num%10;
		num=num/10;
		sum=sum+(rem*rem*rem);
	}
	System.out.println(org);
	if(sum==org) {
		System.out.println("number is ArmStrongnumber"+org);
	}else {
		System.out.println("number is not arm Strong"+org);
	}
}
}
