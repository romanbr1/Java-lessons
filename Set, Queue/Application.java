package task1;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class Application {
	public static void main(String[] args) {
		LinkedHashSet<Book> st = new LinkedHashSet<>();
		st.add(new Book("Java", 980, 1500));
		st.add(new Book("C   ", 456, 2000));
		st.add(new Book("Phyton", 785, 999));
		st.add(new Book("Ruby", 200, 700));
		st.add(new Book("JavaScript", 354, 350));

		
		System.out.println("------Before sorting");
		for (Book book : st) {
			System.out.println(book);
		}
	
		
		System.out.println();
		System.out.println("Comparator ------Aplhabet sorting  (All fields)");
		TreeSet<Book> ts = new TreeSet<>(new BookComparator());
		ts.addAll(st);
		for (Book book : ts) {
			System.out.println(book);
		}
		
		
		System.out.println();
		System.out.println("Comparable ------By cost");
		TreeSet<Book> ts2 = new TreeSet<Book>();
		ts2.addAll(st);
		for (Book book : ts2) {
			System.out.println(book);
		}

	}
}
