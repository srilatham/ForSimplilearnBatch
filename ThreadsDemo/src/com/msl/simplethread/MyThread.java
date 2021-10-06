package com.msl.simplethread;

public class MyThread extends Thread {

	public void run() {
		System.out.println("concurrent thread started running..");
		//
		
	}
	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();
		
		System.out.println("myThread state: " + myThread.getState());
		myThread.start();
		
		System.out.println("myThread state: " + myThread.getState());
		
		myThread.join();
		System.out.println("myThread state: " + myThread.getState());

	}

}
