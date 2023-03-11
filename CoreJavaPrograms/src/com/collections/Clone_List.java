package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Clone_List {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("monday");
		list.add("tuesday");
		list.add("wednesday");
		list.add("thursday");
		list.add("friday");
		list.add("saturday");
		list.add("sunday");
		System.out.println("Befor cloneing"+list);
//		ListIterator<String> itr = list.listIterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		ArrayList<String> clonelist=(ArrayList<String>) list.clone();
		System.out.println("After Cloneing"+clonelist);
	}
}
