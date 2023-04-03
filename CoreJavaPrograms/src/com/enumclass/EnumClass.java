package com.enumclass;

public class EnumClass {
	//enum class can write inside class and outside the class
enum Enums{
	winter(10),summer(20),rainy(30);


private int value;

private Enums(int value) {
	this.value = value;
}

public int getValue() {
	return value;
}

public void setValue(int value) {
	this.value = value;
}

}
public static void main(String[] args) {
	int e=Enums.rainy.getValue();
	System.out.println(e);
	//print the values using foreach
	for (Enums en : Enums.values()) {
		System.out.println(en+" "+en.getValue());
	}
}
}
