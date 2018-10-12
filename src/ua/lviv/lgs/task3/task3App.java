package ua.lviv.lgs.task3;

import java.util.Scanner;

public class task3App {
public static void main(String[] args) {
	
	StringBuffer str = new StringBuffer("");
	Scanner sc = new Scanner(System.in);
	String s;
	System.out.println("Write text ");
	
	s=sc.nextLine();
	str.append(s);
	
	deleteSpases(str);
	str.insert(0, ' ');
	
	
	System.out.println("Sentense contain "+countWord(str)+" words");
}

public static int countWord(StringBuffer str) {
	int count=0;
	for (int i=0;i<str.length();i++) {
		
		if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')&&(str.charAt(i+2)!=' ')&&(str.charAt(i+3)!=' ')) {
			count++;
		}
		
	}
	return count;
}

public static void deleteSpases(StringBuffer str) {
	for (int i=0;i<str.length();i++) {
		while((str.charAt(i)==' ')&&(str.charAt(i+1)==' ')) {
			str.delete(i, i+1);
		}
		
	}
}
}
