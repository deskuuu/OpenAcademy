package Arrays;

import java.math.BigInteger;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner scanInput = new Scanner(System.in);
		Integer count = scanInput.nextInt();
		Integer[] arr = new Integer[count];

		Integer counter = 0;
		while (counter < count) {
			Integer number = scanInput.nextInt();
			arr[counter] = number;
			counter++;
		}

		System.out.println("Enter position K");
		Integer k = scanInput.nextInt();
		if (k < 1 || k > arr.length) {
			System.out.println("Invalid index K");
			return;
		}

		System.out.println("Enter position P");
		Integer p = scanInput.nextInt();
		if (p < 1 || p > arr.length) {
			System.out.println("Invalid index P");
			return;
		}

		scanInput.close();

		BigInteger product = BigInteger.valueOf(1);
		Integer sum = 0;
		for (Integer num = k; num <= p; num++) {
			product = product.multiply(BigInteger.valueOf(arr[num]));
			sum = sum + arr[num];
		}

		System.out.println("The product is: " + product);
	}
}
