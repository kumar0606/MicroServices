package com.basicprograms;

public class Recursion {

	//a method calls it self at multiple times is called recursion
	int fact(int n) {
		if(n==1) {
			return 1;
		}
		int rs=n*fact(n-1);
		return rs;
	}	public static void main(String[] args) {
	Recursion rs=new Recursion();
	int output=rs.fact(5);
	System.out.println(output);
}
}
