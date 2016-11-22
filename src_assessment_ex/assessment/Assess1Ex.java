package assessment;

import java.util.Arrays;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Solution to part (e) to Question 1 in sample assessment problems.
 * Original is qubic efficiency class. 
 * This improvement makes it n^2log(n)
 */
public class Assess1Ex {

	public static int mystery(int target, int[] a) {
		int N = a.length;
		int cnt = 0;
		
	    Arrays.sort(a);;
		for (int i = 0; i < N-1; i++)
			for (int j = i+1; j < N; j++){
				int key = target-a[i]-a[j];
				if (Arrays.binarySearch(a,j+1,N, key) >0)
							cnt++;
			}
		return cnt;
	}

	@Test
	public void testMystery() {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int target = 6;

		assertEquals(mystery(target, a),1);

	}

}
