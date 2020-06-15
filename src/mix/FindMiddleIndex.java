package mix;

public class FindMiddleIndex {
	
	public static int findMiddleIndex(int[] numbers) throws Exception {

		int endIndex = numbers.length - 1;
		int startIndex = 0;
		int sumLeftSide = 0;
		int sumRightSide = 0;
		
		while (true) {
			if (sumLeftSide > sumRightSide) {
				sumRightSide = sumRightSide + numbers[endIndex--];
			} else {
				sumLeftSide = sumLeftSide + numbers[startIndex++];
			}
			if (startIndex > endIndex) {
				if (sumLeftSide == sumRightSide) {
					break;
				} else {
					throw new Exception("array did not match the requirement");
				}
			}
		}
		return endIndex;
	}

	public static void main(String a[]) {
		
		int[] num = { 2, 4, 4,3, 5, 4, 1,5,3};
		
		int arr2[] = { 1, 4, 3, 4, 6, 1 };
		
		try {
			System.out.println("Index at which both side sum equals is " + findMiddleIndex(arr2) + " and");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
