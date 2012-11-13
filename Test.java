package com.ub.thread;

public class Test {

	/**
	 * @param args
	 */

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AbstTest[] abst = new AbstTest(10);
		
		SynchronizedCounter sync = new SynchronizedCounter();
		
		Thread t = new Thread(new FirstThread(sync),"firstThread");
		t.start();
		Thread t1 = new Thread(new SecondThread(sync),"secondThread");
		t1.start();
//		try {
//			t.join();
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		t.start();
//		t.start();
//		t.start();
//		t1.start();
//		t1.start();
	}

}
