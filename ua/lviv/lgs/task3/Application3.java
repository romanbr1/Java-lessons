package ua.lviv.lgs.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Application3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		calculate1();

	}

	public static void calculate1() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = 0;
		double first=0, second=0;
		while (x < 1) {
			try {
				System.out.println("Enter first number: ");
				first = Double.parseDouble(br.readLine());
				x=1;
			} catch (NumberFormatException e) {
				System.out.println("Its not a number");
			}
		}
		x=0;
		while (x < 1) {
			try {
				System.out.println("Enter second number: ");
				second = Double.parseDouble(br.readLine());
				x=1;
			} catch (NumberFormatException e) {
				System.out.println("Its not a number");
			}
		}
		System.out.println("Sum is equal : " + (first + second));
		x = 1;

	}

}
