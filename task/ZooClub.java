import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class ZooClub {
//	Map<Person, List<Animal>> map;	
	Map<Person, List<Animal>> map = new HashMap<>();
  
  	public Map<Person, List<Animal>> getMap(){
      return map;
    }
  	public  void addData() {
		 map.put(new Person("Petro", 12), new ArrayList<>());
		map.put(new Person("Maria", 22), new ArrayList<>());
		map.put(new Person("Anton", 32), new ArrayList<>());
	}	
 
	public  void addPerson(String nm, int ag) {
		map.put(new Person(nm, ag), new ArrayList<>());
	}
  	public  void printZooClub() {
		System.out.println(map);
	}
  	public  void addAnimaltoPerson(String type, String aname,String nm) {
	Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
	   int flag=0;     		
	        		while(iterator.hasNext()) {
	        			Entry<Person, List<Animal>> next = iterator.next();
	        			if(next.getKey().getName().equals(nm)) {
	        				List<Animal> value = next.getValue();
	        				value.add(new Animal(type, aname));
	        				next.setValue(value);
                          flag=1;
	        			}	
	        		}
      				if(flag==0){
                      System.out.println("person doesn't exist");
                    }
	}
  	
    public  void removeAnimalFromPerson(String nm, String aname) {
	Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
	        		int flag1=0, flag2=0;
	        		Iterator<Entry<Person, List<Animal>>> iterator2 = map.entrySet().iterator();
	        		while(iterator2.hasNext()) {
	        			Entry<Person, List<Animal>> next = iterator2.next();
	        			if(next.getKey().getName().equals(nm)) {
                          flag1=1;
	        				List<Animal> groupMembers = next.getValue();
	        					Iterator<Animal> iterator3 = groupMembers.iterator();
	        						while(iterator3.hasNext()) {
	        							Animal next2 = iterator3.next();
	        							if(next2.getNameAn().equalsIgnoreCase(aname)) {
	        								iterator3.remove();
                                          	flag2=1;
	        							}
                                      if(flag2==0){
                      						System.out.println("animal doesn't exist");
                                      }
	        						}
	        			}if(flag1==0){
                      		System.out.println("person doesn't exist");
                        }
                    }
	} 
  	public  void removePerson(String nm) {
  	Iterator<Entry<Person, List<Animal>>> iterator4 = map.entrySet().iterator();
	        		int flag=0;
	        		while(iterator4.hasNext()) {
	        			Entry<Person, List<Animal>> next = iterator4.next();
	        			if(next.getKey().getName().equals(nm)) {
	        				iterator4.remove();
                          flag=1;
	        			}
                      if(flag==0){
                      System.out.println("person doesn't exist");
                    }
	         		}
	}
    public  void removeAnimal(String type) {
  	Iterator<Entry<Person, List<Animal>>> iterator5 = map.entrySet().iterator();
	  int flag=0;      	
      while(iterator5.hasNext()) {
	        			Entry<Person, List<Animal>> next = iterator5.next();
	        			if(next.getKey().getName().equals(type)) {
	        				List<Animal> groupMembers = next.getValue();
	        					Iterator<Animal> iterator3 = groupMembers.iterator();
	        						while(iterator3.hasNext()) {
	        							Animal next2 = iterator3.next();
	        							if(next2.getType().equalsIgnoreCase(type)) {
	        								iterator3.remove();
                                          flag=1;
	        							}
                                      	if(flag==0){
                      					System.out.println("animal doesn't exist");
                   					 }
	        						}
                        }
                    }
    }
	        		
}