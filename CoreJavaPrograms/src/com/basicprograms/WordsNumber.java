package com.basicprograms;

public class WordsNumber {
public static void main(String[] args) {
	int num=199;
	int x,y,z=0;
	
	String eng[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
	if(num<9) {
		System.out.println(eng[num]);
	}
	else if(num<99) {
		x=num/10;
		y=num%10;
		System.out.println(eng[x]+" "+eng[y]);
	}
	else if(num<999) {
		x=num/100;
		y=(num/10)%10;
		z=num%10;
		System.out.println(eng[x]+" "+eng[y]+" "+eng[z]);
	}
}
}
