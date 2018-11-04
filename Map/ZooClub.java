package task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class ZooClub {

	Map<Person, List<Animal>> map = new HashMap<>();
	Set<Entry<Person, List<Animal>>> set = map.entrySet();

	public void addData() {
		map.put(new Person("Petro", 12), new ArrayList<>());
		map.put(new Person("Maria", 22), new ArrayList<>());
		map.put(new Person("Anton", 32), new ArrayList<>());

		Iterator<Entry<Person, List<Animal>>> iter = set.iterator();
		while (iter.hasNext()) {
			Entry<Person, List<Animal>> temp = iter.next();
			temp.getValue().add(new Animal("Cat", "Jery"));
			temp.getValue().add(new Animal("Dog", "Nemo"));
			temp.getValue().add(new Animal("Cow", "Chester"));
			temp.getValue().add(new Animal("Horse", "Tim"));
		}
	}

	public void printZooClub() {
		System.out.println(map);
	}

	public void addPerson() {
		System.out.println("Enter person's name");
		Scanner sc = new Scanner(System.in);
		String pname = sc.nextLine();
		System.out.println("Enter person's age");
		int age = sc.nextInt();
		map.put(new Person(pname, age), new ArrayList<>());
		System.out.println(pname + " added to the club");
	}

	public void addAnimaltoPerson() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pet's type");
		String atype = sc.nextLine();
		System.out.println("Enter pet's name");
		String aname = sc.nextLine();
		System.out.println("Enter person's name");
		String pname = sc.nextLine();

		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		boolean flag = true;

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(pname)) {
				List<Animal> value = next.getValue();
				value.add(new Animal(atype, aname));
				next.setValue(value);
				flag = false;
			}
		}
		if (flag) {
			System.out.println("person doesn't exist");
		} else
			System.out.println("Animal " + aname + " added to " + pname);
	}

	public void removeAnimalFromPerson() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter person's name");
		String pname = sc.nextLine();

		boolean flag1 = true, flag2 = true;
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equalsIgnoreCase(pname)) {
				flag1 = false;
				System.out.println("Enter pet's type");
				String atype = sc.nextLine();
				// List<Animal> groupAnimals = next.getValue();
				Iterator<Animal> iterator2 = next.getValue().iterator();
				while (iterator2.hasNext()) {
					Animal next2 = iterator2.next();
					// System.out.println(next2.getNameAn());
					if (next2.getType().equalsIgnoreCase(atype)) {
						iterator2.remove();
						flag2 = false;
					}
				}
				if (flag2) {
					System.out.println(pname + " has't this animal");
				} else
					System.out.println(pname + " has't " + atype);
			}

		}
		if (flag1) {
			System.out.println("person doesn't exist");
		}
	}

	public void removePerson() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter person's name");
		String pname = sc.nextLine();
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		boolean flag = true;
		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equalsIgnoreCase(pname)) {
				iterator.remove();
				flag = false;
			}

		}
		if (flag) {
			System.out.println("person doesn't exist");
		} else
			System.out.println(pname + " deleted");
	}

	public void removeAnimal() {
		System.out.println("Enter pet's type");
		Scanner sc = new Scanner(System.in);
		String atype = sc.nextLine();
		boolean flag = true;
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			Iterator<Animal> iterator2 = next.getValue().iterator();
			while (iterator2.hasNext()) {
				Animal next2 = iterator2.next();
				if (next2.getType().equalsIgnoreCase(atype)) {
					iterator2.remove();

					flag = false;
				}
			}
		}
		if (flag) {
			System.out.println("animal doesn't exist");
		} else
			System.out.println("Animal " + atype + " removed from all owners");
	}

	public void exit() {
		System.exit(0);

	}

	public static void showMenu() {
		System.out.println("Enter 1 to  Add a member to the club");
		System.out.println("Enter 2 to  Add an animal to the club member");
		System.out.println("Enter 3 to  Remove the animal from the club member");
		System.out.println("Enter 4 to  Remove a member from the club");
		System.out.println("Enter 5 to  Remove a specific animal from all owners");
		System.out.println("Enter 6 to  Show the zoo club on the screen");
		System.out.println("Enter 7 to  Exit the program");
	}

	public void menu() {
		while (true) {
			ZooClub.showMenu();
			Scanner scMenu = new Scanner(System.in);
			int k = scMenu.nextInt();

			switch (k) {
			case (1): {
				addPerson();
				break;
			}
			case (2): {
				addAnimaltoPerson();
				break;
			}
			case (3): {
				removeAnimalFromPerson();
				break;
			}
			case (4): {
				removePerson();
				break;
			}
			case (5): {
				removeAnimal();
				break;
			}
			case (6): {
				printZooClub();
				break;
			}
			case (7): {
				exit();
				break;
			}
			default:
				System.out.println("no such menu item");
				return;
			}
		}

	}

}