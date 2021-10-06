package com.msl.synchro;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class CustomerAccount{  
	int amount=0;  
	Lock amountLock = new ReentrantLock();
	void showBalance() {
		System.out.println("Balance is :" + this.amount);
	}
	
	void updateBalance(int amount) {
		amountLock.lock();
		this.amount+= amount;
		System.out.println(Thread.currentThread().getName()
				+ " :" + this.amount);
		amountLock.unlock();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}  
	  
	public class ThreadLockDemo{ 
		
	public static void main(String args[]){  
	final CustomerAccount c=new CustomerAccount();  

	Thread t1 = new Thread(){  
	
		public void run(){
			for (int i=0; i<5; i++) 				
				c.updateBalance(1);
			c.showBalance();
			}  
	};
	t1.start();  
	
	new Thread(){  
	public void run(){
			for (int i=0; i<5; i++)
			c.updateBalance(1);
		c.showBalance();
		}  
	}.start();  
	
	}	
	}  
