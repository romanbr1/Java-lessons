package ua.lviv.lgs.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import java.util.ListIterator;

public class Faction {
	private String nameOfFaction;
	private List<Deputy> deputs = new ArrayList<>();

	public Faction(String nameOfFaction) {
		super();
		this.nameOfFaction = nameOfFaction;
	}

	public Faction(String nameOfFaction, List<Deputy> deputs) {
		super();
		this.nameOfFaction = nameOfFaction;
		this.deputs = deputs;
	}

	@Override
	public String toString() {
		return nameOfFaction;
	}

	public String getNameOfFaction() {
		return nameOfFaction;
	}

	public void setNameOfFaction(String nameOfFaction) {
		this.nameOfFaction = nameOfFaction;
	}

	public List<Deputy> getDeputs() {
		return this.deputs;
	}

	public void setDeputs(List<Deputy> deputs) {
		this.deputs = deputs;
	}

	public void addDep() {
		this.deputs.add(new Deputy(110, 209, "rolex", "Klychko", "Vit", 50, true, "ak"));
		this.deputs.add(new Deputy(120, 155, "apple", "Proh", "Ivan", 50, true, "uzi"));
		this.deputs.add(new Deputy(120, 155, "casio", "po", "Stepan", 50, false, "---"));
		this.deputs.add(new Deputy(120, 155, "rolex", "Tumosh", "John", 50, true, "gun"));
		this.deputs.add(new Deputy(98, 194, "orient", "Petrenko", "Petro", 45, false, "makarov"));
		this.deputs.add(new Deputy(2, 1, "qwe11111", "Mo", "Sam11111", 50, false, "gun"));
	}

	public void addDep2() {
		this.deputs.add(new Deputy(67, 209, "rolex", "qw1", "maria", 50, true, "ak"));
		this.deputs.add(new Deputy(76, 155, "apple", "qw2", "taras", 50, true, "uzi"));
		this.deputs.add(new Deputy(56, 155, "casio", "qw3", "danylo", 50, false, "---"));
		this.deputs.add(new Deputy(87, 155, "rolex", "qw4", "mukola", 50, true, "gun"));
		this.deputs.add(new Deputy(87, 194, "orient", "qw5", "Petro", 45, false, "makarov"));
		this.deputs.add(new Deputy(56, 1, "qwe11111", "qw6", "oksana", 50, false, "gun"));
	}

	public void addnewDeputy(Deputy d) {
		this.deputs.add(d);
	}

	public void removeDeputy() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter last name: ");
		String lastName = keyboard.nextLine();
		ListIterator<Deputy> listIteratorD = deputs.listIterator();
		boolean flag = true;
		while (listIteratorD.hasNext()) {
			Deputy next = listIteratorD.next();
			if (next.getLastName().equals(lastName)) {
				listIteratorD.remove();
				flag = false;
			}
		}
		if (flag) {
			System.out.println(" doesn't exist");
		}
	}

	public void removeDeputies() {

		ListIterator<Deputy> listIteratorD = deputs.listIterator();
		boolean flag = true;
		while (listIteratorD.hasNext()) {
			Deputy next = listIteratorD.next();
			listIteratorD.remove();
		}
	}

	public void giveBribeDeputy() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter last name: ");
		String lastName = keyboard.nextLine();
		ListIterator<Deputy> listIteratorD = deputs.listIterator();
		boolean flag = true;
		while (listIteratorD.hasNext()) {
			Deputy next = listIteratorD.next();
			if (next.getLastName().equals(lastName)) {
				System.out.print("Bribe summ=: ");
				int br = keyboard.nextInt();
				next.bribe(br);
				flag = false;
			}
		}
		if (flag) {
			System.out.println(" doesn't exist");
		}
	}

	public void showBribers() {
		ListIterator<Deputy> listIteratorD = deputs.listIterator();
		while (listIteratorD.hasNext()) {
			Deputy next = listIteratorD.next();
			if (next.isBribeTaker()) {
				System.out.println(next);
			}
		}
	}

	public void showMaxBribeTakerF() {
		Collections.sort(deputs, new DeputyBribeComparator());
//		System.out.println("after sorting:");
//		for (Deputy deputy : deputs) {
//			System.out.println(deputy);
//		}

		if (deputs.get(0).getBribeSum() > 0) {
			System.out.println("Biggest bribe Taker is ");
			System.out.println(deputs.get(0).getFirstName() + " " + deputs.get(0).getLastName());
		} else
			System.out.println("No bribes were given");
	}
}
