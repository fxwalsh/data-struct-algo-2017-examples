package topic2;

public class ArrayStack implements Stack {

	private int next_index;
	private String[] stack;

	public ArrayStack() {
		stack = new String[100];
		next_index = 0;
	}

	public String pop() {
		if (next_index == 0) {
			throw new RuntimeException("empty stack");
		}
		return stack[--next_index];
	}

	public void delete(int n) {
		next_index -= n;
	}

	public void push(String aString) {
		stack[next_index++] = aString;
	}

	public String top() {
		if (next_index == 0) {
			throw new RuntimeException("empty stack");
		}
		return stack[next_index - 1];
	}

	public boolean isEmpty() {
		return next_index == 0;
	}

}
