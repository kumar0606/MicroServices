package com.strings;
import java.util.StringTokenizer;

public class StringToken {
public static void main(String[] args) {
	StringTokenizer s=new StringTokenizer("hi iam a ravi kumar from srikakulam");
	while(s.hasMoreElements()) {
		System.out.println(s.nextToken());
//		System.out.println(s.nextToken());
//		System.out.println(s.nextToken());
//		System.out.println(s.nextToken());
	}
	StringBuffer st=new StringBuffer("ravi");
	StringBuffer st1=new StringBuffer("ravi");
	System.out.println(st.equals(st1));
	System.out.println(st==st1);
	String d="05";
	System.out.println(1+22+d+5+05);
	String g=null;
	System.out.println(g);
	
	StringTokenizer t=new StringTokenizer("kalavala from ravi");
	while(t.hasMoreElements()) {
		System.out.println(t.nextElement());
	}
	
}
}
