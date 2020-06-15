package search;

import java.util.Arrays;

public class BinarySearch {

	int doBinarySearch(int arr[], int x) {
		
		int l = 0, r = arr.length - 1;
		int count = 1;
		
		while (l <= r) {
			
			System.out.println("Iteration_" + count++);
			System.out.println(Arrays.toString(arr));
			System.out.println("high Index=" + r);
			System.out.println("low Index=" + l);
			
			int m = l + (r - 1) / 2;
			System.out.println("Middle ((low + high) / 2)) Index=" + m);
			System.out.println();

			if (arr[m] == x) {
				return m;
			}

			if (arr[m] < x) {
				l = m + 1;
			} else {
				r = m - 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		int arr[] = { 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int n = arr.length;
		
		int result = binarySearch.doBinarySearch(arr, 11);
		if (result == -1) {
			System.out.println("Element not present");
		} else {
			System.out.println("Element found at " + "index " + result);
		}
		System.out.println("----------");
		
		result = binarySearch.doBinarySearch(arr, 4);
		if (result == -1) {
			System.out.println("Element not present");
		} else {
			System.out.println("Element found at " + "index " + result);
		}
	}
}
