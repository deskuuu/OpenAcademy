package jmv;

//import java.math.BigInteger;
import java.util.Scanner;

public class TwentySixMarch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arr = scanner.nextLine().split("\\s+");
		int numberP = scanner.nextInt();

		int[] numbers = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			numbers[i] = Integer.parseInt(arr[i]);
		}

		int evenNumbers = 0;
		int slowerP = 0;
		int sum = 0; // BigInteger

		for (int number : numbers) {
			if ((number & 1) == 0) {
				evenNumbers++;
			}

			if (number < numberP) {
				slowerP++;
			}

			if (number % 5 == 0 && number % 7 != 0) {
				sum *= number;
			}
		}

		String output = String.format("Even numbers count: %d\nSlower than P= %d numbers count: %d", evenNumbers,
				numberP, slowerP);
		System.out.println(output);
		System.out.println("The work of the numbers which is devidable by 5 and not by 7 is: " + sum);
	}

}
