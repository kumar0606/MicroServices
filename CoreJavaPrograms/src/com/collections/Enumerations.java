package com.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class Enumerations {
public static void main(String[] args) {
	Hashtable hash=new Hashtable();
	hash.put(1, "ravi");
	hash.put(2, "kumar");
	hash.put(3, "satya");
	System.out.println(hash);
	Enumeration e=hash.elements();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
}
}
