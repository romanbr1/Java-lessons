package ua.lviv.lgs.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		runReader();
	}

	public static void runReader() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number: ");
		try {
			double number = Double.parseDouble(br.readLine());

			if (number % 1 == 0) {
				System.out.println("whole");

				if (number % 2 == 0) {
					System.out.println("couple ");
				} else {
					System.out.println("odd");
				}
			} else {
				System.out.println("not whole");
			}
		} catch (NumberFormatException e) {
			System.out.println("Its not a number");
		}
	}

}
