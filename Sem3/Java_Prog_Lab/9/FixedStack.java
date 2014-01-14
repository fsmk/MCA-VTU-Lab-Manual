public class FixedStack implements Stack {
	// Here stack is an Array because it's size is limited
	private int[] mStack;
	// mTop is current size of stack. -1 value means stack is empty
	private int mTop = -1;

	/**
	 * FixedStack which has limited size
	 * 
	 * @param size
	 *            Size of stack
	 */
	public FixedStack(int size) {
		mStack = new int[size];
	}

	@Override
	public void push(int item) {
		// Checking whether the stack is full
		if (mTop + 1 < mStack.length) {
			// If stack is not full. We will first increase the current mTop
			// value by one and add the value to new position of array
			mStack[++mTop] = item;
		} else
			System.out.println("Stack full");
	}

	@Override
	public int pop() {
		int result = -1;
		// Checking stack is already empty
		if (mTop > -1)
			result = mStack[mTop--];
		else
			showEmpty();
		return result;
	}

	@Override
	public void display() {
		for (int i = 0; i <= mTop; i++) {
			System.out.println(mStack[i] + " ");
		}
		showEmpty();
	}

	/**
	 * Function for showing stack empty message
	 */
	private void showEmpty() {
		if (mTop < 0)
			System.out.println("Stack is empty");
	}

}
