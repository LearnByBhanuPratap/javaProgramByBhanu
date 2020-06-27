package mix;

public class FindNumberSumRecursive {

	int sum = 0;

	public int getNumberSum(int number) {

		if (number == 0) {
			return sum;
		} else {
			sum = sum+(number % 10);
			getNumberSum(number / 10);
		}
		return sum;
	}

	public static void main(String a[]) {
		FindNumberSumRecursive findNumberSumRecursive = new FindNumberSumRecursive();
		System.out.println("Sum is: " + findNumberSumRecursive.getNumberSum(223));
	}
}