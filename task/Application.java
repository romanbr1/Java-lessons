package task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;





public class Application {

	public static void main(String[] args) {
		Map<Person, List<Animal>> map = new HashMap<>();
		
		
		menu();
		
		
		map.put(new Person("Petro", 12), new ArrayList<>());
		map.put(new Person("Maria", 22), new ArrayList<>());
		map.put(new Person("Anton", 32), new ArrayList<>());
		
		
		System.out.println(map);
		
		Animal st = new Animal("kit", "www");
		Animal st2 = new Animal("pes", "eee");
		
//		map.put(new Person("SA", 2), new ArrayList<>());
		
		int x = 0;
		Scanner keyboard = new Scanner(System.in);
		if(keyboard.hasNextInt()) 
		{
			x=keyboard.nextInt();
		}
		keyboard.nextLine();
		do {
		  switch (x){
		  		case 1:
		  			System.out.println("Enter person's name");
//		  			Scanner keyboard2 = new Scanner(System.in);
	                String nm = keyboard.nextLine();
	                System.out.println("Enter person's age");
	                int ag = keyboard.nextInt();
	                map.put(new Person(nm, ag), new ArrayList<>());
		  			break;
		  		case 2:
		  			System.out.println("Enter pet's type");
//		  			Scanner keyboard3 = new Scanner(System.in);
	                String atype = keyboard.nextLine();
	                System.out.println("Enter pet's name");
	                String aname = keyboard.nextLine();
	                System.out.println("Enter person's name");
	                String enm = keyboard.nextLine();
	                Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
	        		
	        		while(iterator.hasNext()) {
	        			Entry<Person, List<Animal>> next = iterator.next();
	        			if(next.getKey().getName().equals(enm)) {
	        				List<Animal> value = next.getValue();
	        				value.add(new Animal(atype, aname));
	        				value.add(st2);
	        				next.setValue(value);
	        			}//else System.out.println("person doesn't exist");              todo
	        			
	        		}
	                break;
		  		case 3: 
		  			System.out.println("Enter person's name");
	                String enm2 = keyboard.nextLine();
		  			System.out.println("Enter pet's name");
	                String aname2 = keyboard.nextLine();
	               
	                Iterator<Entry<Person, List<Animal>>> iterator2 = map.entrySet().iterator();
	        		while(iterator2.hasNext()) {
	        			Entry<Person, List<Animal>> next = iterator2.next();
	        			if(next.getKey().getName().equals(enm2)) {
	        				List<Animal> groupMembers = next.getValue();
	        					Iterator<Animal> iterator3 = groupMembers.iterator();
	        						while(iterator3.hasNext()) {
	        							Animal next2 = iterator3.next();
	        							if(next2.getNameAn().equalsIgnoreCase(aname2)) {
	        								iterator3.remove();
	        							}
	        						}
	        			}
	        		}
		  		break;
		  		case 4:
		  			System.out.println("Enter person's name");
//		  			Scanner keyboard2 = new Scanner(System.in);
	                String nm2 = keyboard.nextLine();
	                Iterator<Entry<Person, List<Animal>>> iterator4 = map.entrySet().iterator();
	        		
	        		while(iterator4.hasNext()) {
	        			Entry<Person, List<Animal>> next = iterator4.next();
	        			
	        			if(next.getKey().getName().equals(nm2)) {
	        				iterator4.remove();
	        			}//else System.out.println("person doesn't exist");              todo
	        			
	        		}
		  			break;
		  		case 5: 
		  			
		  			System.out.println("Enter pet's type");
	                String atyp = keyboard.nextLine();
	               
	                Iterator<Entry<Person, List<Animal>>> iterator5 = map.entrySet().iterator();
	        		while(iterator5.hasNext()) {
	        			Entry<Person, List<Animal>> next = iterator5.next();
//	        			if(next.getKey().getName().equals(enm2)) {
	        				List<Animal> groupMembers = next.getValue();
	        					Iterator<Animal> iterator3 = groupMembers.iterator();
	        						while(iterator3.hasNext()) {
	        							Animal next2 = iterator3.next();
	        							if(next2.getType().equalsIgnoreCase(atyp)) {
	        								iterator3.remove();
	        							}
	        						}
//	        			}
	        		}
		  		break;
		  }
		}while(x<555);
		
		
		
		
		
		
		System.out.println(map);
		
	
		System.out.println(map);
		
	}
//	

	public static void menu() {
		System.out.println("Enter 1 to  Add a member to the club");
		System.out.println("Enter 2 to  Add an animal to the club member");
		System.out.println("Enter 3 to  Remove the animal from the club member");
		System.out.println("Enter 4 to  Remove a member from the club");
		System.out.println("Enter 5 to  Remove a specific animal from all owners");
		System.out.println("Enter 6 to  Show the zoo club on the screen");
		System.out.println("Enter 7 to  Exit the program");
	}
}




