package ua.lviv.lgs.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import ua.lviv.lgs.Person;



public class Application {
	
	public static void main(String[] args) {
		
//		private static Integer[] array;
		int size1=3;//getRandomValueFromRange(1, 5);
		int size2=3;//getRandomValueFromRange(1, 5);
//		array =new Integer[size];
	//	List<Car> listCar = new ArrayList<>();
	//	listCar.add(new Car(getRandomValueFromRange(5, 15),getRandomValueFromRange(25, 35)));
//		list5.add(new Person("Pedro", 18));
		
		ArrayList< ArrayList<Car> > listOfCar = new ArrayList();
		listOfCar.add( new ArrayList() );
		int numRows = listOfCar.size();
		int row = numRows - 1;
		
		for (int i=0;i<size1;i++) {
			for (int j=0;j<3;j++) {
		listOfCar.get(row).add(new Car(getRandomValueFromRange(5, 15),getRandomValueFromRange(25, 35)));
			}
			listOfCar.add( new ArrayList() );
			//numRows = listOfCar.size();
			}
		//System.out.println(( listOfCar.get(row).get(0) ));
//		    List<List<Integer>> L; 
//		 //   public void set(int m, int n){
//		    int m=9, n=4;
//		        L = new ArrayList<>(m); // assuming m is the number or rows
//		        for(int i = 0; i < m; ++i) {
//		            L.add(new ArrayList<>(n)); 
//		            //L.add(getRandomValueFromRange(1, 5));
		        //}
		        // now you have a List of m lists where each inner list has n items
		 //   }
		
		Car[][] arrayOfCar = new Car[size1][size2];
		for (int i=0;i<size1;i++) {
			for (int j=0;j<size2;j++) {
				arrayOfCar[i][j]=new Car(getRandomValueFromRange(5, 15),getRandomValueFromRange(25, 35));
		}}
		System.out.println(Arrays.deepToString(arrayOfCar));
	//	System.out.println(Arrays.deepToString(arrayOfCar[1]));
		
		menu();
		 Scanner sc = new Scanner(System.in);
		 String x=sc.next();
//		 System.out.println(arrayOfCar[1][1].getHorsepower());
			switch (x) {
			case "1": {
//				System.out.println(List);
				break;
			}
			case "5": {
				
					System.out.println(listOfCar);
					for (ArrayList<Car> lists: listOfCar) {
						 // System.out.println(("\n" + row++ + " -> "));
						  for (Car elements: lists)   
							  System.out.println((elements + "\t"));
						}
				break;
			}
			case "2": {
//				for (Car[] rows: arrayOfCar) {
//				    Arrays.fill(rows, 45);}
				
		//		Arrays.fill(arrayOfCar[1], 88);
				
				
				for (int i=0;i<size1;i++) {
					for (int j=0;j<size2;j++) {
					arrayOfCar[i][j].setHorsepower(99);
				}}
				System.out.println(Arrays.deepToString(arrayOfCar));
					break;
				}
			case "3": {
				//Arrays.sort(arrayOfCar[1][1].getHorsepower());
				//Arrays.sort(a);
				for (int i=0;i<size1;i++) {
				Arrays.sort(arrayOfCar[i], Comparator.comparing(Car::getHorsepower));
				
				System.out.println(Arrays.deepToString(arrayOfCar[i]));
				System.out.println("----------");
				}
				break;
				}
			}
	}
	
	
static void menu() {
		
		System.out.println ("Tap 1 to print");
		System.out.println ("Tap 2, to fill");
		System.out.println ("Tap 3 to sort");
		System.out.println ("Tap 4 to sort desc");
	}
	
	
	public static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("min value must be smaller than max value");
		}

		Random r = new Random();
		return r.nextInt(max - min + 1) + min; // 1-10
	}
	}