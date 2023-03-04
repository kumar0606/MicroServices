package com.basicprograms;

public class ReverseNumber {
public static void main(String[] args) {
	int num=1213;
	int org=num;
	int rev=0;
	while(num!=0) {
		rev=rev*10+num%10;
		num=num/10;
	}
	System.out.println(rev);
	if(rev==num)
	{
		System.out.println("palindrome");
	}else {
		System.out.println("not palidrome");
	}
}
}
