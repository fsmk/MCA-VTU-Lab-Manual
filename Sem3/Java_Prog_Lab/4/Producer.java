package org.fsmk.sem3;

import java.util.concurrent.Semaphore;

class Producer extends Thread {
	Queue q;
	Semaphore s;

	/**
	 * Producer Constructor, Make use of common queue and semaphore
	 * 
	 * @param q
	 *            Common Queue to be passed
	 * @param s
	 *            Semaphore to be passed
	 */
	Producer(Queue q, Semaphore s) {
		this.q = q;
		this.s = s;
	}

	/**
	 * Produces an item each time this method is called, Acquires the Semaphore
	 * lock before writing to the queue and releases the lock after that
	 */
	public void run() {
		for (int i = 0; true; i++) {
			s.tryAcquire();
			q.put(i);
			// Reduce the speed of production, sleep for 2 seconds for
			// successive production
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			s.release();
		}
	}
}