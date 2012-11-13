package com.ub.thread;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;

public class Sync {
	
	
//	volatile int x = 6;
//	volatile int y = 0;	
	int x = 6;
	int y = 0;
	Thread foo;
	Thread bar;
	
	Semaphore sem = new Semaphore(-1);
	Boolean fooDone = false;
//	Condition fooFinishedcv = new newCondition();
	
	public Sync() {
		foo = new Thread(new Foo(),"Foo Thread");
		bar = new Thread(new Bar(),"Bar Thread");
		foo.start();
		bar.start();
		System.out.println("In Main ::x = "+x+"::y = "+y);
	}
	
	class Foo implements Runnable {

		@Override
		public void run() {
			x++;
			y = x;
			System.out.println("In FOO ::x = "+x+"::y = "+y);
		}
		
		
	}
	
	class Bar implements Runnable {

		@Override
		public void run() {
			y++;
			x+= 3;
			System.out.println("In BAR ::x = "+x+"::y = "+y);
		}
		
		
	}

}
