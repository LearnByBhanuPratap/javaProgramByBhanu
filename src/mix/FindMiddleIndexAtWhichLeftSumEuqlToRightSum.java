package mix;

public class FindMiddleIndexAtWhichLeftSumEuqlToRightSum {

	public static int findMiddleIndexAtWhichLeftSumEuqlToRightSum(int[] numbers) {
		int endIndex = numbers.length - 1;
		int startIndex = 0;
		int sumLeftSide = 0;
		int sumRightSide = 0;

		// [2, 4, 4, 3, 5, 4, 1, 5, 3]
		for (int i = 0; i <= numbers.length-1; i++) {

			sumRightSide = sumRightSide + numbers[endIndex];
			sumLeftSide = sumLeftSide + numbers[startIndex];
			endIndex--;
			startIndex++;
			if (startIndex > endIndex) {
				if (sumLeftSide == sumRightSide) {
					System.out.println(sumRightSide);
					System.out.println(sumLeftSide);
					return --startIndex;
				} else {
					return 0;
				}
			}
		}
		return 0;

	}

	public static int findMiddleIndexAtWhichLeftSumEuqlToRightSum_1(int[] numbers) {

		int endIndex = numbers.length - 1;

		int startIndex = 0;
		int sumLeftSide = 0;
		int sumRightSide = 0;
		int middle = (numbers.length - 1) / 2;
		
		System.out.println("middle=="+middle);

		for (int i = 0; i <= middle; i++) {

			sumRightSide = sumRightSide + numbers[endIndex];
			sumLeftSide = sumLeftSide + numbers[startIndex];

			
			endIndex--;
			startIndex++;

		}
		if (sumLeftSide == sumRightSide) {
			System.out.println(sumRightSide);
			System.out.println(sumLeftSide);
			return --startIndex;
		} else {
			return 0;
		}

	}

	public static void main(String a[]) {

		int[] num = { 2, 4, 4, 3, 5, 4, 1, 5, 3 };
		int[] num1 = { 2, 4, 4, 5, 4, 1 };
		int[] num2 = { 2, 4, 4, 5, 5, 4, 1 };

		int arr2[] = { 1, 4, 3, 4, 6, 1 };

		int status = findMiddleIndexAtWhichLeftSumEuqlToRightSum_1(num);
		if (status == 0) {
			System.out.println("array is not fit for requiretemt");
		} else {
			System.out.println("AT index= " + status + " sum of right side is equal to left side");
		}

//		status = findIndexAtWhichLeftSumEuqlToRightSum(num1);
//		if (status == 0) {
//			System.out.println("array is not fit for requiretemt");
//		} else {
//			System.out.println("AT index= " + status + " sum of right side is equal to left side");
//		}
//
//		status = findIndexAtWhichLeftSumEuqlToRightSum(num2);
//		if (status == 0) {
//			System.out.println("array is not fit for requiretemt");
//		} else {
//			System.out.println("AT index= " + status + " sum of right side is equal to left side");
//		}

	}
}
