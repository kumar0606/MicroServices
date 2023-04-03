package com.java8;

import java.util.ArrayList;

public class Student {
int id;
String name;
double fee;
public Student(int id, String name, double fee) {
	super();
	this.id = id;
	this.name = name;
	this.fee = fee;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getFee() {
	return fee;
}
public void setFee(double fee) {
	this.fee = fee;
}
//@Override
//public String toString() {
//	return "Student [id=" + id + ", name=" + name + ", fee=" + fee + "]";
//}
public static void main(String[] args) {
	ArrayList<Student> s=new ArrayList<>();
	s.add(new Student(1, "ravi", 3000.00));
	s.add(new Student(2, "mahesh", 4000.00));
	s.add(new Student(3, "mani", 5000.00));
//	for (Student student : s) {
//		System.out.println(student);
//	}
	
//	for(int i=2; i<s.size();i++) {
//		System.out.println(s.get(1));
//	}
	
//	System.out.println(s.get(0));
	
//	s.stream().filter(st->st.getFee()==5000).forEach(st->System.out.println(st.getName()));
	s.stream().filter(r->r.getId()==1).forEach(r->System.out.println(r.getName()));
	
}

}
