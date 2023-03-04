package com.abstraction;

abstract  class Animal {
  
	public abstract void Eat();
		

	 void Sound1() {
		System.out.println("iam Concrete method");
	}
	
	public Animal() {
		System.out.println("iam abstract class constructor");
}
}