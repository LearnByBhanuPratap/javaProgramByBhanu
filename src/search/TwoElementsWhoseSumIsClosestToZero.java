package search;

public class TwoElementsWhoseSumIsClosestToZero {

	static void twoElementsWhoseSumIsClosestToZero(int arr[], int arr_size) {

		int lowest_sum, sum, firstElement, secondElement;

		if (arr_size < 2) {
			System.out.println("Invalid Input");
			return;
		}

		firstElement = 0;
		secondElement = 1;
		lowest_sum = arr[0] + arr[1];

		for (int i = 0; i < arr_size - 1; i++) {
			System.out.println("itneration number=="+i);
			
			for (int j = i + 1; j < arr_size; j++) {
				
				sum = arr[i] + arr[j];
				System.out.println("sum== "+sum + " arr[i] + arr[j] "+ arr[i] +" + "+ arr[j]);
				if (Math.abs(lowest_sum) > Math.abs(sum)) {
					System.out.println("lowest_sum== "+sum);
					lowest_sum = sum;
					firstElement = i;
					secondElement = j;
				}
			}
		}

		System.out.println(
				" The two elements whose " + "sum is minimum are " + arr[firstElement] + " and " + arr[secondElement]);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 60, -10, 66, -70, 75 };
		twoElementsWhoseSumIsClosestToZero(arr, 6);
	}
}
