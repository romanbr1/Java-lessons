package task1;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

	public int compare(Book o1, Book o2) {
		if (o1.getTitle().compareTo(o2.getTitle()) > 0) {
			return 1;
		} else if (o1.getTitle().compareTo(o2.getTitle()) < 0) {
			return -1;
		} else {
			if (o1.getCost() > o2.getCost()) {
				return 1;
			} else if (o1.getCost() < o2.getCost()) {
				return -1;

			} else {
				if (o1.getNumberOfPages() > o2.getNumberOfPages()) {
					return 1;
				} else if (o1.getNumberOfPages() < o2.getNumberOfPages()) {
					return -1;
				}
			}
		}
		return 0;
	}
}
