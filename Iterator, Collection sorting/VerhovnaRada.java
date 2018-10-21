package ua.lviv.lgs.task;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class VerhovnaRada {
	private String name;
	private List<Faction> factions = new ArrayList<>();

	public VerhovnaRada() {
		super();
	}

	public VerhovnaRada(String name, List<Faction> factions) {
		super();
		this.name = name;
		this.factions = factions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Faction> getFactions() {
		return factions;
	}

	public void seFaction(List<Faction> factions) {
		this.factions = factions;
	}

	@Override
	public String toString() {
		return "VerhovnaRada name=" + name + ", factions=" + factions;
	}

	public void addFaction(String name) {
		this.factions.add(new Faction(name));
		System.out.println("faction -- " + name + " added");

	}

	public void removeFaction(String name) {
		ListIterator<Faction> listIteratorF = factions.listIterator();
		while (listIteratorF.hasNext()) {
			Faction next = listIteratorF.next();
			if (next.getNameOfFaction().equals(name)) {
				System.out.println(next + " removed");
				listIteratorF.remove();
			}
		}
	}

	public void printFaction(String name) {
		ListIterator<Faction> listIteratorF = factions.listIterator();
		while (listIteratorF.hasNext()) {
			Faction next = listIteratorF.next();
			if (next.getNameOfFaction().equals(name)) {
				System.out.println("printFaction:  " + next);
				System.out.println(next.getDeputs());
			}
		}
	}

	public void showAllBribers() {
		ListIterator<Faction> listIteratorF = factions.listIterator();
		while (listIteratorF.hasNext()) {
			Faction next = listIteratorF.next();
			next.showBribers();

		}
	}

	public void showMaxBribers() {
		ListIterator<Faction> listIteratorF = factions.listIterator();
		while (listIteratorF.hasNext()) {
			Faction next = listIteratorF.next();
			System.out.print("Faction- " + next + "  ");
			next.showMaxBribeTakerF();
		}
	}

	public void addDeputy(Deputy d) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter name of faction: ");
		String name = keyboard.next();
		ListIterator<Faction> listIteratorF = factions.listIterator();
		boolean flag = true;
		while (listIteratorF.hasNext()) {
			Faction next = listIteratorF.next();
			if (next.getNameOfFaction().equals(name)) {
				next.addnewDeputy(d);

				flag = false;
			}

		}
		if (flag) {
			System.out.println("Faction doesn't exist");
		}
	}

	public void removeDeputyFromFaction() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter faction: ");
		String name = keyboard.next();
		ListIterator<Faction> listIteratorF = factions.listIterator();
		boolean flag = true;
		while (listIteratorF.hasNext()) {
			Faction next = listIteratorF.next();
			if (next.getNameOfFaction().equals(name)) {
				next.removeDeputy();
				flag = false;
			}

		}
		if (flag) {
			System.out.println("Faction doesn't exist");
		}
	}

	public void printFactions() {
		ListIterator<Faction> listIteratorF = factions.listIterator();
		System.out.println("List of faction: ");
		while (listIteratorF.hasNext()) {
			Faction next = listIteratorF.next();
			System.out.println("    - " + next);
		}
	}

	public void giveBribe() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter faction: ");
		String name = keyboard.next();
		ListIterator<Faction> listIteratorF = factions.listIterator();
		boolean flag = true;
		while (listIteratorF.hasNext()) {
			Faction next = listIteratorF.next();
			if (next.getNameOfFaction().equals(name)) {
				next.giveBribeDeputy();
				flag = false;
			}

		}
		if (flag) {
			System.out.println("Faction doesn't exist");
		}

	}

	public void clarFaction(String name) {
		ListIterator<Faction> listIteratorF = factions.listIterator();
		while (listIteratorF.hasNext()) {
			Faction next = listIteratorF.next();
			if (next.getNameOfFaction().equals(name)) {
				next.removeDeputies();
			}
		}

	}

}