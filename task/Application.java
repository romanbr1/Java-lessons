
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
	
		int x = 0;
      	ZooClub zoo=new ZooClub();
      	zoo.addData();
		Scanner keyboard = new Scanner(System.in);
		if(keyboard.hasNextInt()) 
		{
			x=keyboard.nextInt();
		}
		keyboard.nextLine();
		//do{
		  switch (x){
		  		case 1:
		  			System.out.println("Enter person's name");
	                String nm = keyboard.nextLine();
	                System.out.println("Enter person's age");
	                int ag = keyboard.nextInt();
              		zoo.addPerson(nm,ag);
		  			break;
		  		case 2:
		  			System.out.println("Enter pet's type");
	                String atype = keyboard.nextLine();
	                System.out.println("Enter pet's name");
	                String aname = keyboard.nextLine();
	                System.out.println("Enter person's name");
	                String nm2 = keyboard.nextLine();
              		zoo.addAnimaltoPerson(atype,aname,nm2);
	                break;
		  		case 3: 
		  			System.out.println("Enter person's name");
	                String nm3 = keyboard.nextLine();
		  			System.out.println("Enter pet's name");
	                String aname3 = keyboard.nextLine();
	               	zoo.removeAnimalFromPerson(nm3, aname3);      		
		  		break;
		  		case 4:
		  			System.out.println("Enter person's name");
	                String nm4 = keyboard.nextLine();
              		zoo.removePerson(nm4);
	                
		  			break;
		  		case 5: 
		  			System.out.println("Enter pet's type");
	                String atyp = keyboard.nextLine();
	               	zoo.removeAnimal(atyp);
		  		break;
                case 6: 
	               	zoo.printZooClub();
		  		break;
                case 7: 
	               	x=556;
		  		break;
		  }
       // }while(x<555);
		zoo.printZooClub();
		
	}
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

