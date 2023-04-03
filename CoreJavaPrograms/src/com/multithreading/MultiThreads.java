package com.multithreading;

public class MultiThreads implements Runnable{

	String name;
	public MultiThreads(String name1) {
		this.name=name1;
	}
	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println(name+i);
		}
		
	}
	public static void main(String[] args) {
	
		MultiThreads m=new MultiThreads("thread");
		MultiThreads m1=new MultiThreads("thread");
		Thread t=new Thread(m);
		Thread t1=new Thread(m1);
		t.start();
		t1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main:"+i);
		}
	}

}
