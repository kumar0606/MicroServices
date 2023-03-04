package com.basicprograms;

public class Vowels {
public static void main(String[] args) {
	String s="ravi kumar kalaval";
	int vowel=0;
	int constant=0;
	s=s.toLowerCase();
	char ch[]=s.toCharArray();
	  for (int i =1; i<s.length(); i++) {
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
			vowel++;
		}
		else if(ch[i]>='a'&&ch[i]<='z') {
			constant++;
		}
	}
	  System.out.println(vowel);
	  System.out.println(constant);
}
}
