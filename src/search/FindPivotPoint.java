package search;

import java.util.Arrays;

public class FindPivotPoint {

	static int findPivot(int arr[], int low, int high) {

		int count = 1;
		while (high > low) {
			System.out.println("Iteration_" + count++);
			System.out.println(Arrays.toString(arr));
			System.out.println("high Index=" + high);
			System.out.println("low Index=" + low);

			if (high < low)
				return -1;
			if (high == low)
				return low;

			int mid = (low + high) / 2;
			
			System.out.println("Middle ((low + high) / 2)) Index=" + mid);
			System.out.println();

			if (mid < high && arr[mid] > arr[mid + 1]) {
				return mid;
			}

			if (mid > low && arr[mid] < arr[mid - 1]) {
				return (mid - 1);
			}

			if (arr[low] >= arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {

		int arr1[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };

		int arr2[] = { 3, 4, 5, 1, 2 };
		int n = arr1.length;
		int key = 3;
		
		System.out.println(findPivot(arr2, 0, arr2.length));

		System.out.println("*******************");
		System.out.println(findPivot(arr1, 0, arr1.length));

	}

}
