package search;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.youtube.com/c/learnbybhanu
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class DuplicateNumber {

	public int findDuplicateNumber(List<Integer> numbers) {
		int n = numbers.size() - 1;
		int total = getTotalSum(numbers);
		System.out.println("total=="+total);
		System.out.println("sum of n number=="+(n * (n + 1) / 2));
		int duplicate = total - (n * (n + 1) / 2);
		return duplicate;
	}

	public int getTotalSum(List<Integer> numbers) {

		int sum = 0;
		for (int num : numbers) {
			sum = sum + num;
		}
		return sum;
	}

	public static void main(String a[]) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i < 30; i++) {
			numbers.add(i);
		}
		numbers.add(22);
		DuplicateNumber dn = new DuplicateNumber();
		System.out.println("Duplicate Number: " + dn.findDuplicateNumber(numbers));
	}
}
