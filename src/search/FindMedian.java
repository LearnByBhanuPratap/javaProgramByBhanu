package search;

public class FindMedian {

	static int getMedianData(int ar1[], int ar2[], int n) {
		int i = 0;
		int j = 0;
		int count;
		int prev = -1, next = -1;

	
		for (count = 0; count <= n; count++) {
		
			if (i == n) {
				prev = next;
				next = ar2[0];
				break;
			}

		 
			else if (j == n) {
				prev = next;
				next = ar1[0];
				break;
			}

			if (ar1[i] < ar2[j]) {
				
				prev = next;
				next = ar1[i];
				i++;
			} else {
		
				prev = next;
				next = ar2[j];
				j++;
			}
		}

		return (prev + next) / 2;
	}

	public static void main(String[] args) {
		int ar1[] = { 1,12,14};
		int ar2[] = { 2,13,19};

		int n1 = ar1.length;
		int n2 = ar2.length;
		if (n1 == n2)
			System.out.println("Median is " + getMedianData(ar1, ar2, n1));
		else
			System.out.println("arrays are of unequal size");
	}

}
