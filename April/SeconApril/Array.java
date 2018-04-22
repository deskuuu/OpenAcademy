package SchoolMarks;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner scanInput = new Scanner(System.in);
		Integer count = scanInput.nextInt();
		Integer[] arr = new Integer[count];
		Integer k = scanInput.nextInt();
		Integer p = scanInput.nextInt();

		Integer counter = 0;
		while (counter < count) {
			arr[counter] = scanInput.nextInt();
			counter++;
		}
		scanInput.close();

		for (Integer i = 0; i < arr.length-1;i++) {
			if (arr[i] + k == arr[i + 1] * p) {
				System.out.println(i + " " + i + 1);
				return;
			}
		}
	}
}
