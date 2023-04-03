package com.multithreading;
public class JavaThread extends Thread {

    @Override
    public void run() {

        System.out.println("Starting thread: " + Thread.currentThread());
        // 2000 milliseconds = 2 seconds
        for (int i = 1; i < 10; i++) {
            System.out.println(" Java programming .."+i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Completed thread: " + Thread.currentThread());
    }
public static void main(String[] args) {
	JavaThread j=new JavaThread();
	j.run();
}
}
