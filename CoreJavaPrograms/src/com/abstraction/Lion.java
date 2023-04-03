package com.abstraction;

public class Lion implements Animals{

	@Override
	public void sound() {
		System.out.println("roar...........");
		
	}
	public static void main(String[] args) {
		Lion l=new Lion();
		l.sound();
	}

}
