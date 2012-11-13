package com.ub.thread;

public class Entrypoint {


	private boolean lock = false;
	private Integer sum = 0;
	private Integer sum1 = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Entrypoint ent = new Entrypoint();

		Thread t = new Thread(ent.consumer,"Consumer");
		t.start();

		Thread t1 = new Thread(ent.producer,"producer");
		t1.start();


	}

	Runnable producer = new Runnable() {

		@Override
		public void run() {
			synchronized (sum) {
				System.out.println("In producer producing sum");
				for(int i=0;i<200;i++) {
					sum1 += 200;
				}
				lock = true;
				sum.notify();
			}
			

		}
	};


	Runnable consumer = new Runnable() {

		@Override
		public void run() {
			synchronized (sum) {
				while(lock == false) {
					try {
						System.out.println("Waiting for sum to complete....");
						sum.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("In consumer sum :"+sum1);
			}
		}
	};


}
