package topic2;

public class CollectionStack implements Stack {
	private java.util.Stack<String> stack;

	public CollectionStack()
	 {
	 stack = new java.util.Stack<String>();
	 }

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public String pop() {
		return stack.pop();
	}

	public void push(String item) {
		stack.push(item);
	}

	public String top() {
		return stack.peek();
	}
}
