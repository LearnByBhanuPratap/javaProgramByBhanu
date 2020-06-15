package mix;

public class SecondSmallestNumber {

	static void printTwoSmallest(int arr[]) {

		int firstSmall, secondSmall;

		if (arr.length < 2) {
			System.out.println(" Invalid Input ");
			return;
		}

		firstSmall = arr[0];
		secondSmall = arr[1];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < firstSmall) {
				secondSmall = firstSmall;
				firstSmall = arr[i];
			}

			else if (arr[i] < secondSmall && arr[i] != firstSmall) {
				secondSmall = arr[i];
			}
		}

		System.out.println(
				"The smallest element is " + firstSmall + " and second Smallest" + " element is " + secondSmall);
	}

	public static void main(String[] args) {
		int arr[] = { 12, 13, 1, 10, 34, 3 };
		printTwoSmallest(arr);
	}
}
