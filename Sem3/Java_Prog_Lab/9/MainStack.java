import java.util.Scanner;

/**
 * Main program.
 * This will allow user to choose and use Dynamic or Fixed size stack
 */
public class MainStack {
	// mStack is abstract object of both class Dynamic and Fixed both impliment
	// Stack interface
	private Stack mStack;
	private Scanner scanner;

	public MainStack() {
		scanner = new Scanner(System.in);
		int choice = 0;
		System.out.println("1. To create a dynamic length stack.");
		System.out.println("2. To fixed length stack.");
		System.out.println("*. To exit.");
		try {
			choice = scanner.nextInt();
		} catch (Exception e) {
			errorExit();
		}
		// Choosing which type of stack user want (Dynamic or Fixed)
		switch (choice) {
		case 1:
			mStack = new DynamicStack();
			break;
		case 2:
			System.out.print("Enter the size :");
			int size = 0;
			try {
				size = scanner.nextInt();
			} catch (Exception e) {
				errorExit();
			}
			mStack = new FixedStack(size);
			break;

		default:
			errorExit();
			break;
		}

		// Showing menu to use stack functionality
		showMenu();
	}

	private void showMenu() {

		while (true) {
			System.out.println("Enter your option :");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			int choice = 0;
			try {
				choice = scanner.nextInt();
			} catch (Exception e) {
				errorExit();
			}
			switch (choice) {
			case 1:
				push();
				break;
			case 2:
				// Poping item from stack and showing poped item.
				System.out.println(mStack.pop() + " removed");
				break;
			case 3:
				// Displaying current stack
				display();
				break;
			case 4:
				System.exit(1);
				break;
			}
		}

	}

	private void display() {
		System.out.println("Current stack :");
		mStack.display();
	}

	/**
	 * Function to push to stack.
	 */
	private void push() {
		int item = 0;
		System.out.println("Enter item push :");
		try {
			// Asking the user to enter item to push stack.
			item = scanner.nextInt();
		} catch (Exception e) {
			errorExit();
		}
		mStack.push(item);
	}

	/**
	 * Function to exit the program if any input error.
	 */
	private void errorExit() {
		System.out.println("Invalid entry.");
		System.exit(0);
	}

	public static void main(String arg[]) {
		new MainStack();
	}
}
