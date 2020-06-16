package mix;

public class FindTwoMaxNumbers {

	public void printTwoMaxNumbers(int[] nums) {
		
		int maxFirst = 0;
		int maxSecond = 0;
		
		for (int n : nums) {
			if (maxFirst < n) {
				maxSecond = maxFirst;
				maxFirst = n;
			} else if (maxSecond < n) {
				maxSecond = n;
			}
		}
		System.out.println("First Max Number: " + maxFirst);
		System.out.println("Second Max Number: " + maxSecond);
	}

	public static void main(String a[]) {
		int num[] = { 4, 32, 78, 3, 45, 2, 98, 23 };
		FindTwoMaxNumbers findTwoMaxNumbers = new FindTwoMaxNumbers();
		findTwoMaxNumbers.printTwoMaxNumbers(num);
	}
}