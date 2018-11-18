package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;



public class Main {

	public static void main(String[] args) {
		// HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();
		HashMap<String, String> myHashMap = new HashMap<String, String>();
		myHashMap.put("Basil", "07.12.1987"); // put
		myHashMap.put("Kate", "12.10.1971");
		myHashMap.put("Lena", "11.01.1991");
		for (Entry<String, String> entry : myHashMap.entrySet())
			System.out.println(entry.getKey() + " - " + entry.getValue());

		System.out.println("The value for 'Basil' is " + myHashMap.get("Basil")); // get

		myHashMap.remove("Kate"); // remove
		System.out.println("\nAfter removing the key:");
		for (Map.Entry<String, String> entry : myHashMap.entrySet())
			System.out.println(entry.getKey() + " - " + entry.getValue());

		System.out.println("Do we have 'Basil'? " + myHashMap.containsKey("Basil")); // containsKey
		System.out.println("Do we have 'Victoria'? " + myHashMap.containsKey("Victoria"));
		myHashMap.put("Kate", "12.10.1971");
		System.out.println("Do we have a value'12.10.1971'? " + myHashMap.containsValue("12.10.1971")); // containsValue
		System.out.println("Do we have a value 'lalala'? " + myHashMap.containsValue("lalala"));

		System.out.println("The size of map is " + myHashMap.size()); // size

		System.out.println();

		myHashMap.replace("Lena", "11.01.1993");
		System.out.println(myHashMap.values());
		System.out.println(myHashMap.keySet());
		System.out.println("\n\n");
		
		
		
		Map<Person, Integer> map2 = new TreeMap<>();
		map2.put(new Person("Ringo", 13), 2);
		map2.put(new Person("Evelina", 17), 2);
		map2.put(new Person("Pall", 19), 3);
		map2.put(new Person("Jackson", 47), 4);
		map2.put(new Person("Kira", 27), 5);

		for (Entry<Person, Integer> entry : map2.entrySet()) {
			System.out.println(entry.getKey() + "--->" + entry.getValue());
		}
	}

}
class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person o) {
		return this.age > o.getAge() ? 1 : -1;
	}

}
