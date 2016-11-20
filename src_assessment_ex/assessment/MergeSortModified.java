package assessment;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortModified {
	private MergeSortModified.Item[] items;
	private MergeSortModified.Item[] helper;
	MergeSortModified.Item[] unsortedItems;

	private int number;

	public void sort(MergeSortModified.Item[] values) {
		this.items = values;
		number = values.length;
		this.helper = new MergeSortModified.Item[number];
		this.unsortedItems = new MergeSortModified.Item[number];

		for (int i = 0; i < values.length; i++)
			this.unsortedItems[i] = values[i];
		
		mergesort(0, number - 1);
	}

	private void mergesort(int low, int high) {
		// check if low is smaller then high, if not then the array is sorted
		if (low < high) {
			// Get the index of the element which is in the middle
			int middle = low + (high - low) / 2;
			// Sort the left side of the array
			mergesort(low, middle);
			// Sort the right side of the array
			mergesort(middle + 1, high);
			// Combine them both
			merge(low, middle, high);
		}
	}

	private void merge(int low, int middle, int high) {

		// Copy both parts into the helper array
		for (int i = low; i <= high; i++) {
			helper[i] = items[i];
		}

		int i = low;
		int j = middle + 1;
		int k = low;
		// Copy the smallest values from either the left or the right side back
		// to the original array
		while (i <= middle && j <= high) {
			if (helper[i].value.compareTo(helper[j].value) < 0) {
				items[k] = helper[i];
				//*************************************************************
				// adding value from left side implies all remaining values in
				// right side are
				// greater. Therefore, add number of remaining values IN THE RIGHT 
				// SIDE 
				// (from j+1 to high).
				//*************************************************************
				items[k].count += high - j + 1;
				i++;
			} else {
				items[k] = helper[j];
				j++;
			}
			k++;
		}
		// Copy the rest of the left side of the array into the target array
		while (i <= middle) {
			items[k] = helper[i];
			k++;
			i++;
		}

	}

	static class Item implements Comparable<Item> {
		public Comparable value;
		public int count;

		public Item(Comparable value) {
			count = 0;
			this.value = value;
		}

		@Override
		public String toString() {
			return "Item [value=" + value + ", count =" + count + "]";
		}

		@Override
		public int compareTo(Item item) {
			// TODO Auto-generated method stub
			return this.value.compareTo(item.value);
		}
	}
}