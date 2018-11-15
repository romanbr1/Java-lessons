package task1;


public class Book implements Comparable<Book> {
	private String title;
	private int cost;
	private int numberOfPages;

	public Book(String title, int cost, int numberOfPages) {
		super();
		this.title = title;
		this.cost = cost;
		this.numberOfPages = numberOfPages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + "\t cost=" + cost + "\t numberOfPages=" + numberOfPages + "]";
	}

	@Override
	public int compareTo(Book o) {
		return this.cost>o.getCost()?1:-1;
	}
	

}
