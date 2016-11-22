package assessment;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveInts {

	/**
	 * Solution to consecutive integers problem in the sample assessment.
	 */
	@Test
	public void testConsecutiveInt() {
		int [] a = {1, 5, 3, 7, 9};
		
		//using for loops
		assertTrue(consecutive(a,15));
		
		//using while and indexes
		assertTrue(consecutiveLowerUpper(a,8));
		
		Arrays.sort(a);
		
		//using sorted array
		assertTrue(consecutiveSorted(a,8));
		
		

	}
	
	/**
	 * @param a A sorted array of integers
	 * @param target : sum of consecutive values to search for
	 * @return true if target is found, false otherwise.
	 */
	private static boolean consecutiveSorted(int[] a, int target) {		
		
		for (int i=0;i<a.length-2;i++){
			if (a[i]>target/2) break;//no point in proceeding. Any sequence after this point will be > target
			int total=a[i];
			int offset=1;
			do {  
				total+=a[i+offset];	
				if (total==target) return true;
				if (a[i+offset]>target/2) break; //since it's sorted, any elements left will result in total>target
				offset++;
			}while (total<=target && i+offset<a.length);
		}	
		return false;
			

	}

	public static boolean consecutive(int [] a,int target ){
		
		for (int i=0;i<a.length;i++){
			int total=a[i];
			int offset=1;
			do {  		
			//   	if (i+offset==a.length) break;
				total+=a[i+offset];	
				if (total==target) return true;
				offset++;
			}while (total<=target  && i+offset<a.length);
		}	
		return false;
	}
	
public static boolean consecutiveLowerUpper(int [] a,int target ){
		
	    int lower=0,upper =0;
	    int total = a[lower];
			do {  
				upper++;
			   	if (lower+upper==a.length) break;
				total+=a[upper];	
				if (total==target) return true;
				else if (total>target){
					    total-=a[upper--];
						total-=a[lower++];
				}
			}while (lower<a.length);
		
		return false;
	}

}
