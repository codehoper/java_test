package com.ub.thread;

public class SecondThread implements Runnable{

	SynchronizedCounter syncCounter;
	public SecondThread(SynchronizedCounter sync) {
		this.syncCounter = sync;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.syncCounter.decrement();
		System.out.println("Dec value ::"+this.syncCounter.getC());
	}

}
