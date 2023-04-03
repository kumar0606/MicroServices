package com.strings;

public class StringDemo {
public static void main(String[] args) {
	String str="4";
	System.out.println(1+10+str+10+1);
	
	//2
	String s="abc";
	System.out.println(s.substring(2));
	StringBuffer sf=new StringBuffer(s);
	System.out.println(s.equals(sf));
	
	//3
	String s1=null;
	System.out.println(s1.valueOf(13));
	
	//4
	String s4="abc";
	String sn=new String("abc");
	sn=sn.intern();
	System.out.println(s4==sn);
}
}
