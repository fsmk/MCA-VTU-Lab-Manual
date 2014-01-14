package org.fsmk.sem3;

/**
 * The common queue to both Producer and Consumer
 */
class Queue {
	int MIN = -1;
	int QUEUE_SIZE = 10; // MAX queue size
	int buffer[] = new int[QUEUE_SIZE]; // holds the items
	int index = MIN; // always points to the updated item.

	/**
	 * Get the value in LIFO order
	 * 
	 * @return current index value or -1 if queue empty
	 */
	public int get() {
		if (index > MIN) {
			return this.buffer[index--];
		}
		return -1;
	}

	/**
	 * Puts item into queue if the queue has empty slots
	 * 
	 * @param item
	 *            item to be pushed
	 * 
	 */
	public void put(int item) {
		if (index < QUEUE_SIZE - 1) {
			this.buffer[++index] = item;
			System.out.println("Producer value:" + this.buffer[index]);
		} else {
			System.out.println("Producer queue full");
		}
	}
}
