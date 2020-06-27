package mix;

public class FindCommonElementsInArray {

	public static void main(String a[]) {
		int[] arr1 = { 5, 7, 31, 9, 20 };
		int[] arr2 = { 7, 2, 11, 9, 31, 32, 4 };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}
}