package com.ub.interview;

public abstract  class  Abstract implements Mprovides {

	public abstract void getAllInfo();
	
	abstract void getAllInfoCancel();

	abstract void getAllBalance();
	
	void getAllInfoOk() {
		System.out.println("All is well");
	}
	
	int startUp;
	int endDown;
	
	public Abstract() {
	
		startUp = 10;
		endDown = 20;
	}
	
}