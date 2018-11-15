package ua.lviv.lgs;



import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Fraction {

	private String name;

	Fraction(String s) {
		this.name = s;

	}

	private List<Deputate> list = new LinkedList();

	

	public void addDeputates() {
		this.list.add(new Deputate(90, 190, "taras", "taras", 50, true, 24));
		this.list.add(new Deputate(90, 190, "danylo", "danylo", 50, true, 252));
		this.list.add(new Deputate(90, 190, "mukola", "mukola", 50, false));
		this.list.add(new Deputate(90, 190, "oksana", "oksana", 50, true, 145));

	}

	public void addDeptate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight: ");
		double w = sc.nextDouble();
		System.out.println("Enter height: ");
		double h = sc.nextDouble();
		System.out.println("Enter First Name: ");
		String fN = sc.next();
		System.out.println("Enter Last Name: ");
		String lN = sc.next();
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		System.out.println("Is he BribeTaker (true/false): ");
		boolean bT = sc.nextBoolean();
		Deputate d = new Deputate(w, h, fN, lN, age, bT);
		d.takeBriber();
		list.add(d);
	}

	public void removeDeputate() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String fN = sc.nextLine();
		System.out.println("Enter Last Name: ");
		String lN = sc.nextLine();

		list.removeIf(o -> o.getLastName().equalsIgnoreCase(lN) && o.getFirstName().equalsIgnoreCase(fN));
	}

	public void showBriberTaker() {
		List<Deputate> list2 = list.stream().filter(o -> o.isBribeTaker()).collect(Collectors.toList());
		if (!list2.isEmpty()) {
			list2.forEach(System.out::println);
		} else {
			System.out.println("there are no briber takers in fraction");
		}

	}

	public void showMaxBriberTaker() {

		Comparator<Deputate> sortByBribe = (c1, c2) -> (c1.getBriber() > c2.getBriber()) ? -1 : 1;

		List<Deputate> collect = list.stream().sorted(sortByBribe).limit(1).collect(Collectors.toList());
		collect.forEach(o -> System.out.println("Max briber is " + o + " wich has " + o.getBriber() + "$"));
		
	}

	public void showFraction() {
		if (!list.isEmpty()) {
			list.forEach(System.out::println);
		} else {
			System.out.println("No deputates in fraction");
		}
	}

	public void cleanFraction() {
		list.clear();
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Fraction [name = " + name + "]";
	}

}
