package ua.lviv.lgs.task4;

import java.util.Scanner;

public class task4App {
	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("");
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Write text ");

//		s = sc.nextLine();
		s="Lorem Ipsum is simply dummy.. text. of the. Printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy "
				+ "text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type. Specimen book. It has "
				+ "survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised"
				+ " in the 1960s with the release of. Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software"
				+ " like Aldus PageMaker including. Versions of Lorem Ipsum.";
		str.append(s);

		 deleteSpases(str);
		

		System.out.println("Text contain " + countSentences(s) + " sentences");
	}

	public static int countSentences(String str) {
		int count = 0;
		for (int i = 0; i < str.length()-2; i++) {
//			char ch=;
			if ((str.charAt(i) == '.') && (str.charAt(i + 1) == ' ') && (Character.isUpperCase(str.charAt(i+2)))) {
				count++;
			}

		}
		return count;
	}

	public static void deleteSpases(StringBuffer str) {
		for (int i = 0; i < str.length(); i++) {
			while ((str.charAt(i) == ' ') && (str.charAt(i + 1) == ' ')) {
				str.delete(i, i + 1);
			}

		}
	}
}
