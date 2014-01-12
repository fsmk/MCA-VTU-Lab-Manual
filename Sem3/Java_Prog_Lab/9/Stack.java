/**
 * Interface which abstract all Stack functions
 */
public interface Stack {
	/**
	 * Function to add item to stack
	 * @param item Item to push to stack
	 */
	public void push(int item);

	/**
	 * Function to remove item from stack
	 * @return Popped item
	 */
	public int pop();

	/**
	 * Function to display current stack item
	 */
	public void display();
}
