package Arrays;

import java.util.Scanner;

public class Salaryes {
	public static void main(String[] args) {
		Scanner scanInput = new Scanner(System.in);
		Integer count = scanInput.nextInt();
		Double[] arr = new Double[count];

		System.out.println("Enter the salary: ");
		Double find = scanInput.nextDouble();

		System.out.println("Enter the position: ");
		Integer position = scanInput.nextInt();

		Integer counter = 0;
		while (counter < count) {
			Double number = scanInput.nextDouble();
			arr[counter] = number;
			counter++;
		}

		Integer indexes = 0;
		Integer coun = 0;
		while (coun < count) {
			Double number = arr[coun];
			
			if (number == find) {
				if (indexes == position) {
					indexes = coun;
					System.out.println("Index: " + indexes);
					return;
				}
				indexes++;
			}
			coun++;
		}
	}
}
