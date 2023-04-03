
package com.strings;

public class StringHashCodes {
public static void main(String[] args) {
	String s="ravi";
	String s1=new String("ravi");
	System.out.println(s.equals(s1));
	System.out.println(s.hashCode());
	System.out.println(s1.hashCode());
	s=s.concat("kumar");
	System.out.println(s.hashCode());
	
	StringBuffer sb=new StringBuffer("ravi");
	StringBuffer sb1=new StringBuffer("ravi");
	
	System.out.println(sb.equals(sb1));
	System.out.println(sb==sb1);
	System.out.println(sb.hashCode());
	sb=sb.append("kumar");
	System.out.println(sb.hashCode());
	
	
}
}
