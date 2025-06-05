package com.learning.advance.thread;

class Resource {
	public void methodA(Resource other) {
		System.out.println(Thread.currentThread().getName() + " acquired lock on this object");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + " trying to acquire lock on other object");
		other.methodB();
	}

	public void methodB() {
		System.out.println(Thread.currentThread().getName() + " acquired lock on other object");
	}
}

public class DeadlockExample {
	public static void main(String[] args) {
		Resource resource1 = new Resource();
		Resource resource2 = new Resource();

		Thread t1 = new Thread(() -> resource1.methodA(resource2), "Thread-1");
		Thread t2 = new Thread(() -> resource2.methodA(resource1), "Thread-2");

		t1.start();
		t2.start();
	}
}