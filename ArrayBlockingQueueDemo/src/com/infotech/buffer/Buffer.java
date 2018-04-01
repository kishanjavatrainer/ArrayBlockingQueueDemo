package com.infotech.buffer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//Shared class used by threads
public class Buffer {
	// ArrayBlockingQueue
	private BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(1);

	public void get() {
		// retrieve from ArrayBlockingQueue
		try {
			System.out.println("Consumer received - " + blockingQueue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void put(int data) {
		try {
			// putting in ArrayBlockingQueue
			blockingQueue.put(data);
			System.out.println("Producer produced - " + data);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
