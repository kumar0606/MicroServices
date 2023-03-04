package com.abstraction;

public class Animaltest extends Cat{

	@Override
	void sound() {
		System.out.println("meowwww.....");
		
	}

	@Override
	public void Eat() {
		System.out.println("milk");
	}
public static void main(String[] args) {
	Animaltest a=new Animaltest();
	a.Eat();
	a.sound();
	
}
}
