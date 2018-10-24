package task;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ZooClub {
//	Map<Person, List<Animal>> map;	
//	Map<String, List<Animal>> map = new HashMap<>();
	public static void addPerson(Map<Person, List<Animal>> map, Scanner keyboard) {
		System.out.println("Enter person's name");
		String nm = keyboard.nextLine();
		System.out.println("Enter person's age");
		int ag = keyboard.nextInt();
		map.put(new Person(nm, ag), new ArrayList<>());
	}
}

