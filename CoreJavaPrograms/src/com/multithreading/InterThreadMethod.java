package com.multithreading;

class Customer {
	int balance = 10000;

	public synchronized int withdraw(int withdrawamount) {
		System.out.println("before withdraw process:" + balance);
		System.out.println("Enter withdraw amount");
		if (balance < withdrawamount) {
			System.out.println("your acount is in sufficient funds");
			try {
				wait();// waits the thread lifetime until notify method calls
				// wait(10000);//waits the thread required time
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance = balance - withdrawamount;
		System.out.println("After withdraw is completed: " + balance);
		return withdrawamount;
	}

	public synchronized void deposit(int diposit) {
		System.out.println("befor diposit the amount is:" + balance);
		System.out.println("please deposit the amount");
		balance = balance + diposit;
		System.out.println("Diposited is completed :" + balance);
		notify();// it is used to release the wait method
	}
}

public class InterThreadMethod {
	// A thread will provides information to another thread or threads about lock
	// availability

	public static void main(String[] args) {
		Customer c = new Customer();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(20000);

			}
		}.start();
	}
}
