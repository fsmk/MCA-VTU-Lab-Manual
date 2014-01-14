package org.fsmk.sem3;

import java.util.concurrent.Semaphore;

//4.Write a JAVA program using Synchronized Threads, which demonstrates Producer Consumer concept.
class Prog3_ProducerConsumer {
	public static void main(String args[]) {
		Queue q = new Queue();
		Semaphore semaphore = new Semaphore(1);
		Producer p = new Producer(q, semaphore);
		Consumer c = new Consumer(q, semaphore);
		p.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		c.start();

	}

}
