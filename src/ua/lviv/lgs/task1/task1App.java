package ua.lviv.lgs.task1;

import java.util.Scanner;

public class task1App {
	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("");
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Write a word with 5 letters: ");
		do {
			s = sc.next();
			if (s.length() != 5) {
				System.out.println("the word must contain 5 letters");
			}
		} while (s.length() != 5);

		str.append(s);
		String s2 = str.reverse().toString();

		if (s2.equalsIgnoreCase(s)) {
			System.out.println("word is a palindrom");
		} else {
			System.out.println("word is not a palindrom");
		}
		sc.close();
	}
}
