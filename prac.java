import java.io.*;
import java.util.Scanner;

public class prac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input");
		int number = sc.nextInt();
		String pattern = "FORMULAQSOLUTION";
		int m, n, patternIndex = 0;
		for (m = 1; m <= number; m++) {

			for (n = 1; n <= number - m; n++) {
				System.out.print(" ");
			}

			for (n = 1; n <= m * 2 - 1; n++) {
				System.out.print(pattern.charAt(patternIndex));
				patternIndex = (patternIndex + 1) % pattern.length();
			}

			System.out.println();
		}

		patternIndex = 0;

		for (m = number - 1; m > 0; m--) {

			for (n = 1; n <= number - m; n++) {
				System.out.print(" ");
			}
			for (n = 1; n <= m * 2 - 1; n++) {
				System.out.print(pattern.charAt(patternIndex));
				patternIndex = (patternIndex + 1) % pattern.length();
			}

			System.out.println();
		}
	}
}
