package task1;

import java.util.Comparator;
import java.util.LinkedHashSet;

public class Application {
	public static void main(String[] args) {
		LinkedHashSet<Book> st = new LinkedHashSet<>();
		st.add(new Book("Java", 980, 1500));
		st.add(new Book("C   ", 456, 2000));
		st.add(new Book("Phyton", 785, 999));
		st.add(new Book("Phyton", 200, 700));
		st.add(new Book("JavaScript", 354, 350));

		System.out.println("------Before sorting");
		st.stream().forEach(System.out::println);

		System.out.println();
		System.out.println("Comparator ------Aplhabet sorting  (All fields)");

		Comparator<Book> sortByBrandsTitleAndPrice = (c1, c2) -> {
			if (c1.getTitle().compareTo(c2.getTitle()) != 0) {
				return c1.getTitle().compareTo(c2.getTitle());
			} else if (c1.getCost() > c2.getCost()) {
				return 1;
			} else if (c1.getCost() < c2.getCost()) {
				return -1;
			}
			return 0;
		};
		st.stream().sorted(sortByBrandsTitleAndPrice).forEach(System.out::println);

		System.out.println();
		System.out.println("Comparable ------By cost");
		
		st.stream().sorted().forEach(System.out::println);

	}
}
