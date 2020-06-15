package mix;

/**
 * https://www.youtube.com/c/learnbybhanu 
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class StringRecursiveReversal {

	String reverse = "";

	String rev = "";

	public String reverseString(String str) {
		
		if (str.length() == 0) {
			System.out.println("str===" + str);
			return str;
		} else {

			reverse = reverse + str.charAt(str.length() - 1);

			str = str.substring(0, str.length() - 1);
			System.out.println("str---" + str);
			System.out.println("reverse---" + reverse);
			reverseString(str);
			return reverse;
		}
	}

	public String reverseString_1(String str) {

		if (str.length() == 1) {
			return str;
		} else {
			rev = rev + str.charAt(str.length() - 1) + reverseString_1(str.substring(0, str.length() - 1));
			return rev;
		}
	}

	public String reverseString_2(String str) {

		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		return reverse;
	}

	public static void main(String a[]) {
		StringRecursiveReversal stringRecursiveReversal = new StringRecursiveReversal();
		System.out.println("Result: " + stringRecursiveReversal.reverseString("Hello"));
		
		System.out.println("hkjfghkfdgh===="+"H".substring(0,0));
		// System.out.println("Result: " +
		// stringRecursiveReversal.reverseString("Hello"));
		// System.out.println("Result: " +
		// stringRecursiveReversal.reverseString_2("Hello"));
	}
}
