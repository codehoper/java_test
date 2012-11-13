package com.ub.thread;

public class TimerThread {


	Thread secondThread;
	Thread minuteThread;
	Thread hourThread;

	SecondThread sec = new SecondThread();
	MinuteThread min = new MinuteThread();
	HourThread hr = new HourThread();


	public TimerThread() {
		//	Three worker thread
		//	How to assign work to worker thread ?
		//	How to combine the result ?
		//	How to know that thread finished their respective work?
		secondThread = new Thread(sec,"second thread");
		minuteThread = new Thread(min,"Minute thread");
		hourThread = new Thread(hr,"hour thread");
		secondThread.start();
		minuteThread.start();
		hourThread.start();
	}

	public void startTimer() {
		while(true) {
			System.out.println("");
			System.out.println(hr.getHour()+":"+ min.getMin() +":"+ sec.getSecond() );
			try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void stopTimer() {

	}

	public void pauseTimer() {

	}

	class SecondThread implements Runnable {

		private int second = 0;
		@Override
		public void run() {
			while(true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				second++;
				if(second == 61) {
					second = 0;
				}
			}
		}
		public int getSecond() {
			return second;
		}				
	}

	class MinuteThread implements Runnable {

		private int min = 0;
		@Override
		public void run() {
			while(true) {
				try {
					Thread.sleep(60*1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				min++;
				if(min == 61) {
					min = 0;
				}
			}
		}
		public int getMin() {
			return min;
		}



	} 

	class HourThread implements Runnable {
		private int hour = 0;
		@Override
		public void run() {
			while(true) {
				try {
					Thread.sleep(60*60*1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				hour++;
				if(hour == 13) {
					hour = 1;
				}
			}
		}
		public int getHour() {
			return hour;
		}

	}


}
