package com.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employe {
	int id;
	String name;
	double salary;

	public Employe(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		List<Employe> e = new ArrayList<Employe>();
		e.add(new Employe(101, "ravi", 30000.00));
		e.add(new Employe(102, "kumar", 40000.00));
		e.add(new Employe(103, "satya", 60000.00));
		System.out.println(e);
		Iterator<Employe> i = e.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(e.toString());
		e.stream().filter(st->st.salary==60000.00).forEach(st -> System.out.println(st.getName()));
	}
}
