package mix;

public class IsPerfectNumber {

	public boolean isPerfectNumber(int number) {

		int sum = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		if (sum == number) {
			System.out.println(number+ " It is a perfect number");
			return true;
		} else {
			System.out.println(number+ " It is not a perfect number");
			return false;
		}
	}

	public static void main(String a[]) {
		IsPerfectNumber isPerfectNumber = new IsPerfectNumber();
		System.out.println("Is perfect number: " + isPerfectNumber.isPerfectNumber(12));
	}
}
