package com.java8;

import java.util.ArrayList;
import java.util.List;

public class Product {
	int id;
	String name;
	double price;

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	

	public static void main(String[] args) {
		List<Product> po = new ArrayList<Product>();
		po.add(new Product(1, "dell laptop", 30000.00));
		po.add(new Product(2, "lenovo laptop", 40000.00));
		po.add(new Product(3, "hp laptop", 50000.00));
		
		po.stream().filter(product->product.getPrice()==40000.00)
		.forEach(product->System.out.println(product.getName()));
			}

	

}
