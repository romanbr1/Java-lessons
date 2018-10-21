package ua.lviv.lgs.task;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import ua.lviv.lgs.Student;

public class Application {
	public static void main(String[] args) {
		VerhovnaRada vr = new VerhovnaRada();

		//initial data
		vr.addFaction("fr1");
		vr.addFaction("fr2");
		//vr.addFaction("fr3");
		vr.getFactions().get(0).addDep();
		vr.getFactions().get(1).addDep2();
		vr.getFactions().get(0).getDeputs().get(1).setBribeSum(500);
		vr.getFactions().get(1).getDeputs().get(3).setBribeSum(4180);
		
		//
		int x=0;
		do { 
			menu();
			
		Scanner keyboard = new Scanner(System.in);
		if(keyboard.hasNextInt()) 
		{
			x=keyboard.nextInt();
		}
		
    
		  switch (x){
		  		case 1:System.out.println("Enter faction's name");
		  			Scanner keyboard2 = new Scanner(System.in);
	                String x1 = keyboard2.nextLine();
		  			vr.addFaction(x1);
		  			break;
		  		case 2:System.out.println("Enter faction's name");
		  			Scanner keyboard3 = new Scanner(System.in);
		  			String x11 = keyboard3.nextLine();
		  			vr.removeFaction(x11);
		  			break;
		  		case 3:
		  			vr.printFactions();
		  			break;
		  		case 4:
		  			System.out.println("Enter faction's name");
	                String x4 = keyboard.next();
		  			vr.clarFaction(x4);
		  			break;	
		  		case 5:
		  			System.out.println("Enter faction's name");
	                String x2 = keyboard.next();
		  			vr.printFaction(x2);
		  			break;	
		  		case 6:
		  			vr.addDeputy(addD());
		  			break;	
		  		case 7:
		  			vr.removeDeputyFromFaction();
		  			break;
		  		case 8:
		  			vr.showAllBribers();
		  			break;
		  		case 9:
		  			vr.showMaxBribers();
		  			break;
		  		case 0:
		  			vr.giveBribe();
		  			break;
		  }
		  
		}while (x<555);
	}

	public static Deputy addD() {
			Scanner keyboard = new Scanner(System.in);	
			System.out.print("Please enter first name: ");
			String firstName = keyboard.nextLine();	
			System.out.print("Please enter last name: ");
			String lastName = keyboard.nextLine();
			System.out.print("Please enter watch name: ");
			String watch = keyboard.nextLine();
			System.out.print("Please enter gun type: ");
			String gun = keyboard.nextLine();
			System.out.print("Please enter age: ");
			int age = keyboard.nextInt();
			System.out.print("Please enter weight: ");
			int weight = keyboard.nextInt();
			System.out.print("Please enter height: ");
			int height = keyboard.nextInt();
			System.out.print("Please enter take or not take: 0 or 1");
			boolean bribeTaker=false;// = keyboard.nextBoolean();		
			if (keyboard.nextInt()==1) {
			bribeTaker = true;
			}else {bribeTaker = false;}
			return new Deputy(weight, height, watch, lastName, firstName, age, bribeTaker, gun);
	}

	static void menu() {
		System.out.println("-------------menu---------------------");
		System.out.println("Enter 1 to add a fraction");
		System.out.println("Enter 2 to delete a specific faction");
		System.out.println("Enter 3 to display all factions");
		System.out.println("Enter 4 to clear a specific faction");
		System.out.println("Enter 5 to display a specific faction");
		System.out.println("Enter 6 to add a member to the faction");
		System.out.println("Enter 7 to remove a deputy from the faction");
		System.out.println("Enter 8 to list the bribe takers");
		System.out.println("Enter 9 to bring out the biggest bribe");
		System.out.println("Enter 0 to give the bribe");
		System.out.println("----------------------------------------");
	}
}
