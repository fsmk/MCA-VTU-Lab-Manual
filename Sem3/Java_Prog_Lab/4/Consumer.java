package org.fsmk.sem3;

import java.util.concurrent.Semaphore;

/**
 * Consumer class, consumes items
 */
class Consumer extends Thread {
	Queue q;
	Semaphore s;

	/**
	 * Consumer Constructor, Make use of common queue and semaphore
	 * 
	 * @param q
	 *            Common Queue to be passed
	 * @param s
	 *            Semaphore to be passed
	 */

	Consumer(Queue q, Semaphore s) {
		this.q = q;
		this.s = s;
	}

	/**
	 * Consumes an item each time this method is called, Acquires the Semaphore
	 * lock before consuming from the common queue and releases the lock after
	 * that.
	 */
	public void run() {
		while (true) {
			s.tryAcquire();
			int item = q.get();
			
			if (item != -1)
				System.out.println(" >Consumer  value:" + item);
			else
				System.out.println("get emptly");

			// Reduce the speed of production, sleep for 1 seconds for
			// successive consumption
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			s.release();

		}
	}
}