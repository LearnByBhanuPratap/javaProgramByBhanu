package mix;

public class FindMinAndMaxInArray {

	static int min;
	static int max;

	static void getMinMax(int arr[], int n) {
		int i;
		if (arr[0] > arr[1]) {
			max = arr[0];
			min = arr[1];
		} else {
			max = arr[1];
			min = arr[0];
		}
		for (i = 2; i < n; i++) {
			if (arr[i] > min && arr[i] > max ) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("min=" + min + " max=" + max);
	}

	public static void main(String args[]) {
		int arr[] = { 1000, 11, 4450, 1, 330, 3000 };
		int arr_size = 6;
		getMinMax(arr, arr_size);
	}

}