package assessment_2016;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class Q1 {

	@Test
	public final void test() {
		
		Random rand = new Random();
		int size = rand.nextInt(100);
		int [] array = new int[size];
		for (int i =0;i<size;i++)
			array[i]=rand.nextInt();
		
		
		assertEquals(mystery(array),mystery_better(array));
		
	
	}

	// @param array of integers
	// @return an int
	public static int mystery(int array[]) {
		int val = 0, diff = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				diff = Math.abs(array[i] - array[j]); // Math.abs() computes
														// absolute value
				if ((i != j) && (diff > val)) {
					val = diff;
				}
			}
		}
		return val;
	}
	
	// @param array of integers
		// @return an int
		public static long mystery_better(int array[]) {
			long  low = array[0],high=array[0];
			for (int i = 1; i < array.length; i++) {
				
					if (low>array[i]) 
						low = array[i];
					if  (high<array[i]) 
						high = array[i];
				}
			
			return Math.abs(high-low);
		}

}
