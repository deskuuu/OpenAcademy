package jvm;

import java.util.Scanner;

public class sixteenApril {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		int[][] matrix = new int[row][col];
		int k = scanner.nextInt();

		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				matrix[r][c] = scanner.nextInt();
			}
		}

		Boolean isKInMatrix = false;
		int repetitionOfK = 0;
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				if (matrix[r][c] == k) {
					isKInMatrix = true;
					repetitionOfK++;
				}
			}
		}

		System.out.println("Is " + k + " in the matrix? = " + isKInMatrix);

		Boolean isTheSameInCol = false;
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col - 1; c++) {
				if (matrix[r][c] == matrix[r][c + 1]) {
					isTheSameInCol = true;
					break;
				}
			}
		}
		System.out.println("Is " + k + " in the matrix  coll neighbours? = " + isTheSameInCol);

		Boolean isTheSameInRow = false;
		for (int r = 0; r < row - 1; r++) {
			for (int c = 0; c < col; c++) {
				if (matrix[r][c] == matrix[r + 1][c]) {
					isTheSameInRow = true;
					break;
				}
			}
		}
		System.out.println("Is " + k + " in the matrix row neighbours? = " + isTheSameInRow);

		Integer[] indexesRow = new Integer[repetitionOfK];
		Integer[] indexesCow = new Integer[repetitionOfK];
		int counter = 0;
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				if (matrix[r][c] == k) {
					indexesRow[counter] = r;
					indexesCow[counter] = c;
					counter++;
				}
			}
		}

		System.out.println("The half past index is: [" + indexesRow[repetitionOfK - 1] + ", "
				+ indexesCow[repetitionOfK - 1] + "]");
	}
}
