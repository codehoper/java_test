package com.ub.thread;

public class FirstThread implements Runnable{

	SynchronizedCounter syncConunter;
	public FirstThread(SynchronizedCounter sync) {
		this.syncConunter = sync;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.syncConunter.increment();
		System.out.println("Inc value ::"+this.syncConunter.getC());
	}

}
