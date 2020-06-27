package mix;

public class MySwapingTwoNumbersWithoutThirdVariables {

	public static void main(String a[]) {
		int x = 11;
		int y = 21;
		System.out.println("Before swap ");
		System.out.println("x value= " + x);
		System.out.println("y value= " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swap ");
		System.out.println("x value= " + x);
		System.out.println("y value= " + y);
	}
}