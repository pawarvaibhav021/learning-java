package com.learning.advance.thread;

public class LearningThread {
	public static void main(String[] args) {
		for (int j = 0; j < 10; j++) {
			final int i = j;
			Thread t1 = new Thread(() -> {
				System.out.println("THIS IS THREAD " + i);
				try {
					Thread.sleep(500);
				}
				catch (Exception e) {
					System.out.println("caught below exception"+e);
				}
			});
			t1.start(); 
			try {
				t1.join();
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
