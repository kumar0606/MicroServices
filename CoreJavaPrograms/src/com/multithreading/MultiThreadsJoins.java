package com.multithreading;

public class MultiThreadsJoins implements Runnable{
    //joins are used to pause the current thread  and
	// until specific thread is completed
	
	
	String name;
	public MultiThreadsJoins(String name1) {
		this.name=name1;
	}
	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println(name+i);
		}
		
	}
	public static void main(String[] args) {
		
		MultiThreadsJoins m=new MultiThreadsJoins("thread1:");
		MultiThreadsJoins m1=new MultiThreadsJoins("thread2:");
		Thread t=new Thread(m);
		Thread t1=new Thread(m1);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
				
		 
		try {
			t1.start();
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 1; i < 10; i++) {
			System.out.println("main:"+i);
		}
	}

}
