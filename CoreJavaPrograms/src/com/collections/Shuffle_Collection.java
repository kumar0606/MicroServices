package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Shuffle_Collection {
public static void main(String[] args) {
	ArrayList<String> arr=new ArrayList<>();
	arr.add("monday");
	arr.add("tuesday");
	arr.add("wednesday");
	arr.add("thursday");
	arr.add("friday");
	arr.add("saturday");
	arr.add("sunday");
	System.out.println(arr);
	Collections.shuffle(arr);
	System.out.println(arr);
}
}
