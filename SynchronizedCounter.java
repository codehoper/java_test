package com.ub.thread;

public class SynchronizedCounter {
    private int c = 0;

//    public synchronized void increment() {
//        c++;
//    }
//
//    public synchronized void decrement() {
//        c--;
//    }
    
//    public  void increment() {
//    	synchronized(this) {
//    		c++;
//    	}
//        
//    }
//
//    public void decrement() {
//    	synchronized (this) {
//    		c--;	
//		}
//        
//    }
    

    public void increment() {
        c++;
    }

    public void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }

	public int getC() {
		return c;
	}
    
    
}