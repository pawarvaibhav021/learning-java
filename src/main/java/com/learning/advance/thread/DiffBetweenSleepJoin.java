package com.learning.advance.thread;

public class DiffBetweenSleepJoin {
	public static void main(String[] args) {
		ExampleThread t1 = new ExampleThread();
		System.out.println("next line will start t1");
		t1.start();
		System.out.println("finished start t1");
		try {
			t1.join(); // Waits for t1 to complete
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Main thread resumes.");
	}

	
}
class ExampleThread extends Thread {
    public void run() {
        try {
        	System.out.println("inside run method");
            Thread.sleep(10000); // Pauses for 2 seconds
            System.out.println("Sleep() is executed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}