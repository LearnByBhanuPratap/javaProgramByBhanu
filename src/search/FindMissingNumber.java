package search;

public class FindMissingNumber {

	static void findMissingNumber(int arr[], int number) {

		int totalSum = (number * (number + 1)) / 2;

		System.out.println("totalSum=" + totalSum);

		

		int actualSum = 0;

		for (int i = 0; i < arr.length; i++) {
			actualSum = actualSum + arr[i];
		}

		System.out.println("missing number=" + (totalSum - actualSum));
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 4, 6, 3 };

		int n = 6;

		findMissingNumber(arr, n);

	}

}
