package mix;

/**
 * https://www.youtube.com/c/learnbybhanu
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class DecimalToBinary {

	public void printBinaryFormat(int number) {
		
		int binary[] = new int[20];
		
		int index = 0;
		while (number > 0) {
			binary[index] = number % 2;
			index++;
			number = number / 2;
			System.out.println(number);
		}
		
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}

	public static void main(String a[]) {
		DecimalToBinary decimalToBinary = new DecimalToBinary();
		decimalToBinary.printBinaryFormat(6);
	}
}