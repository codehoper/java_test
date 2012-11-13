package com.ub.interview;

public class SingletonTest {

	private static SingletonTest singletonTestInstance = null;

	private SingletonTest() {

	}

	public static SingletonTest getInstance() {
		//Double checked locking
		if(singletonTestInstance == null) {
			synchronized(SingletonTest.class) {
				if(singletonTestInstance == null) {
					singletonTestInstance = new SingletonTest();
				}
			}
		}
		return singletonTestInstance;
	}


}
