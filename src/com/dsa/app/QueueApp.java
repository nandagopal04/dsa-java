package com.dsa.app;

import com.dsa.structure.Queue;

public class QueueApp {

	public static void main(String[] args) {
		Queue queue = new Queue(10);
		queue.printFirst();
		queue.printLast();
		queue.printLast();
		queue.printQueue();
		queue.enqueue(11);
		System.out.println();
		queue.printQueue();
		queue.printFirst();
		queue.printLast();
		queue.printLast();
	}

}
