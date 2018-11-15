package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class MainRada {

	private static MainRada m;
	private static ArrayList<Fraction> list = new ArrayList();

	private MainRada() {

	}

	static public MainRada createMainRada() {

		if (m == null) {
			m = new MainRada();
			list.add(new Fraction("Freedom"));
			list.add(new Fraction("Independence"));
			list.add(new Fraction("Regions"));
			list.add(new Fraction("q"));
		}

		return m;
	}

	public void adD() {
		list.get(3).addDeputates();
	}

	public void addFraction() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of fraction: ");
		String N = sc.nextLine();

		list.add(new Fraction(N));
		list.forEach(System.out::println);
	}

	public void removeFraction() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of fraction: ");
		String n = sc.nextLine();

		list.remove(list.stream().filter(o -> o.getName().equalsIgnoreCase(n)).limit(1).collect(Collectors.toList()).get(0));
	}

	public void showFractions() {
		list.forEach(System.out::println);
	}

	public void cleanFraction() {
		System.out.println("Enter Fraction");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		list.stream().filter(o -> o.getName().equalsIgnoreCase(s)).forEach(o -> o.cleanFraction());
	}

	public void addDeputate() {
		System.out.println("Enter Fraction");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		list.stream().filter(o -> o.getName().equalsIgnoreCase(s)).forEach(o -> o.addDeptate());
	}

	public void removeDeputate() {
		System.out.println("Enter Fraction");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		list.stream().filter(o -> o.getName().equalsIgnoreCase(s)).forEach(o -> o.removeDeputate());
	}

	public void showBribeTakers() {
		System.out.println("Enter Fraction");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		list.stream().filter(o -> o.getName().equalsIgnoreCase(s)).forEach(e -> e.showBriberTaker());
	}

	public void showMaxBriber() {
		System.out.println("Enter Fraction");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		list.stream().filter(o -> o.getName().equalsIgnoreCase(s)).forEach(e -> e.showMaxBriberTaker());
	}

	public void showFraction() {
		System.out.println("Enter Fraction");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		list.stream().filter(o -> o.getName().equalsIgnoreCase(s)).forEach(e -> e.showFraction());
	}
}
