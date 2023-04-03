package com.mathtest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.math.Calculator;

public class CalculatorTest {

	@BeforeClass
	public static void beforeclass() {
		System.out.println("before class");
	}
	@AfterClass
	public static void afterclass() {
		System.out.println("after class");
	}
	@Before
	public  void beforemethod() {
		System.out.println("before method");
	}
	@After
	public  void aftermethod() {
		System.out.println("after method");
	}
@Test
public void test1() {
	System.out.println("test1");
	Calculator cal=new Calculator();
	assertEquals(30, cal.sum(10, 20));
}

@Test(expected = IllegalArgumentException.class)
public void test2() {
	System.out.println("test2");
	Calculator cal=new Calculator();
	assertEquals(10, cal.sum(-10, 20));
}

@Test(expected = IllegalArgumentException.class)

public void test3() {
	System.out.println("test3");
	Calculator cal=new Calculator();
	assertEquals(-10, cal.sum(10, -20));
}
}
