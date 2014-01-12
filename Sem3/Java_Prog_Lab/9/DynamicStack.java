import java.util.ArrayList;

public class DynamicStack implements Stack {
	// mStack in dynamic here because we use ArrayList
	private ArrayList<Integer> mStack;

	/**
	 * DynamicStack which has unlimited size
	 */
	public DynamicStack() {
		mStack = new ArrayList<Integer>();
	}

	@Override
	public void push(int item) {
		mStack.add(item);
	}

	@Override
	public int pop() {
		// Removing the last item from ArrayList
		return mStack.remove(mStack.size() - 1);
	}

	@Override
	public void display() {
		for (int item : mStack) {
			System.out.println(item + " ");
		}
		// Show empty message if stack is empty
		if (mStack.size() == 0)
			System.out.println("Stack is empty");
	}

}
