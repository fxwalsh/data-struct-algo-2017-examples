package topic2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

	private Stack testStack;

	@Before
	public void setUp() {
		//testStack = new ArrayStack();
		testStack = new CollectionStack();
	}

	@After
	public void tearDown() {
		testStack = null;
	}

	@Test
	public void top() {
		testStack.push("Item 1");
		assertEquals("Item 1", testStack.top());
		assertEquals("Item 1", testStack.top());
		assertEquals("Item 1", testStack.top());
		assertFalse(testStack.isEmpty());
	}

	// Case 2
	@Test
	public void emptyStack() {
		assertTrue(testStack.isEmpty());
	}

	// Case 2
	@Test(expected = Exception.class)
	public void testTopException() {
		testStack.top();
	}

	// Case 2
	@Test(expected = Exception.class)
	public void testPopException() {
		testStack.pop();
	}

	@Test
	public void testPop() throws Exception {
		String testStr = new String("test");
		testStack.push(testStr);
		assertEquals(testStr, testStack.pop());
		assertEquals(0.1,0.1,0.1);
		try {
			testStack.pop();
			fail("Pop should throw exception");
		} catch (Exception e) {
			assertTrue(true);
		}

	}

	@Test
	public void testPopDuplicate() {
		String test1 = new String("test");
		String test2 = new String("test");
		String test3 = new String("test");

		testStack.push(test1);
		testStack.push(test2);
		testStack.push(test3);

		assertSame(test3, testStack.pop());
		assertSame(test2, testStack.pop());
		assertSame(test1, testStack.pop());
	}

	@Test
	public void testNull() {
		testStack.push(null);
		assertEquals(null, testStack.pop());
	}

	@Test
	public void testException() {
		try {
			testStack.pop();
			fail("Pop should throw exception");
		} catch (Exception e) {
			assertTrue(true);
		}
		testStack.push("test");
		assertEquals("test", testStack.top());
		assertFalse(testStack.isEmpty());
	}
}
