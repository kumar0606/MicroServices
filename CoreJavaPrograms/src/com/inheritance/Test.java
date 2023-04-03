package com.inheritance;

public class Test {
public static void main(String[] args) {
	GrandFather g=new GrandFather();
	g.land();
	Father f=new Father();
	f.land();
	f.House();
	Son s=new Son();
	s.Car();
	s.House();
	s.land();
}
}
