package com.msl.synchro;

class AccountHolder{  
	 volatile int  amount= 0;  
	 
	void showBalance() {
		System.out.println("Balance is :" + this.amount);
	}
	
	void updateBalance(int amount) {
		this.amount += amount;
	}
	
	}  
	  
	public class ThreadVolatileDemo{  
	public static void main(String args[]){  
	final AccountHolder c=new AccountHolder();  
		
	Thread t1 = new Thread(){  
	
		public void run(){
	
			for (int i=0; i<1000; i++) 				
				c.updateBalance(2);
			c.showBalance();
			}  
	};
	t1.start();  
	
	new Thread(){  
	public void run(){

		for (int i=0; i<1000; i++)
			c.updateBalance(3);
		c.showBalance();
		}  
	}.start();  
	
	}
	
	}  
