package com.multithreading;


public class ThreadSynchronization implements Runnable{
int count;
	@Override
	public synchronized void run() {
for (int i = 0; i <10; i++) {
	count++;
}		
	}
public static void main(String[] args) {
	ThreadSynchronization m=new ThreadSynchronization();
	Thread t1=new Thread(m);
	Thread t2=new Thread(m);
	System.out.println(t1.isAlive());
	t1.start();
	t2.start();
	System.out.println(t1.isAlive());
	t1.setName("ravi thread");
	System.out.println(t1.getName());
	try {
		t1.join();
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(m.count);
}
}
