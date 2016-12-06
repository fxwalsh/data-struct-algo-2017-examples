package assessment;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import assessment.MergeSortModified.Item;

public class MergeSortModifiedTest {

	private MergeSortModified.Item[] numbers;
	private final static int SIZE = 5;
	private final static int MAX = 10;

	@Before
	public void setUp() throws Exception {
		numbers = new MergeSortModified.Item[SIZE];
		Random generator = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new MergeSortModified.Item(generator.nextInt(MAX));
		}
	}

	@Test
	public void testMergeSort() {
		long startTime = System.currentTimeMillis();

		MergeSortModified sorter = new MergeSortModified();
		sorter.sort(numbers);

		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("Mergesort " + elapsedTime);

		// check it's sorted.
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i].value.compareTo(numbers[i + 1].value) > 0) {
				fail("Should not happen");
			}
		}
		assertTrue(true);

		printItems(sorter.unsortedItems);

	}

	private void printItems(Item[] numbers) {
		for (MergeSortModified.Item i : numbers)
			System.out.println(i);

	}

}
