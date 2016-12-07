package assessment_2016;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.google.common.base.Preconditions;

public class Intersection {

	public static int[] intersectionMerge(int[] a, int[] b) {
		Preconditions.checkNotNull(a);
		Preconditions.checkNotNull(b);
		Preconditions.checkArgument(a.length == b.length);
		Arrays.sort(a);
		Arrays.sort(b);
		int n = a.length;
		int[] intArray = new int[n];
		int i = 0, j = 0, k = 0;
		// merge

		while (i < n && j < n) {

			if (a[i] == b[j]) {
				intArray[k] = a[i];
				if (k > 0 && intArray[k - 1] == a[i]) // in case duplicate
														// numbers
					k--;
				k++;
				i++;
				j++;

			} else if (a[i] > b[j]) {
				j++;
			} else {
				i++;
			}
			if (i == n || j == n)
				break;
		}

		return Arrays.copyOf(intArray, k);

	}

	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 1, 3 };
		int[] b = { 3, 1, 1, 1, 1 };

		int[] c = intersectionMerge(a, b);

		for (int i : c) {
			System.out.println(i);
		}

	}

}
