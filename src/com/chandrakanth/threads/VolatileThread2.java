package com.chandrakanth.threads;

public class VolatileThread2 extends Thread {

	PropertyObject propObj = new PropertyObject();

	public void run() {

		propObj.doAdd(2);
		System.out.println("Thread Value\t" +propObj.getInt());
	}

}
