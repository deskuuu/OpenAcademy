package SchoolMarks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		Scanner scanInput = new Scanner(System.in);
		ArrayList<Integer> marks = new ArrayList<Integer>();

		Integer mark = 0;
		while (mark != -1) {
			mark = scanInput.nextInt();

			if (mark < 2 || mark > 6) {
				System.out.println("Invalid mark!");
			}

			marks.add(mark);
		}
		scanInput.close();

		Integer poor = 0;
		Integer fair = 0;
		Integer good = 0;
		Integer veryGood = 0;
		Integer excelent = 0;

		for (Integer markk : marks) {
			// Collections.frequency(marks, markk);
			switch (markk) {
			case 2:
				poor++;
				break;
			case 3:
				fair++;
				break;
			case 4:
				good++;
				break;
			case 5:
				veryGood++;
				break;
			case 6:
				excelent++;
				break;
			default:
				break;
			}
		}

		ArrayList<Integer> sorted = new ArrayList<Integer>(5);
		sorted.add(poor);
		sorted.add(fair);
		sorted.add(good);
		sorted.add(veryGood);
		sorted.add(excelent);
		Collections.sort(sorted);
		
		System.out.println("2=> " + poor);
		System.out.println("3=> " + fair);
		System.out.println("4=> " + good);
		System.out.println("5=> " + veryGood);
		System.out.println("6=> " + excelent);
		System.out.println("The most ocurrencies=> " + sorted.get(sorted.size() - 1));
	}
}
