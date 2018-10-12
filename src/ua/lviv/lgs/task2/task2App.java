package ua.lviv.lgs.task2;

import java.util.Scanner;

public class task2App {
	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("");
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Write text ");
		int mas[] = { 101, 121, 117, 105, 111, 97, 69, 89, 85, 73, 79, 65 };
		s = sc.nextLine();

		str.append(s);

		for (int i = 0; i < str.length(); i++) {
			if (contains(mas, str.codePointAt(i))) {
				s.charAt(i);
				str.setCharAt(i, '-');
			}

		}
		System.out.println(str);
	}

	public static boolean contains(int[] array, int v) {

		boolean result = false;

		for (int i : array) {
			if (i == v) {
				result = true;
				break;
			}
		}

		return result;
	}

}
