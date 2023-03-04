package com.multithreading;

public class MultiThreading implements Runnable {
	

	@Override
	public void run() {
		System.out.println("thread strat" + Thread.currentThread().getName());
		for (int i = 0; i <= 10; i++) {
System.out.println("ravi.....");
try {
	Thread.sleep(200);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		}
		System.out.println("thread strat" + Thread.currentThread().getName());
	}
	public static void main(String[] args) {
      MultiThreading m=new MultiThreading();
      m.run();
	}

}
