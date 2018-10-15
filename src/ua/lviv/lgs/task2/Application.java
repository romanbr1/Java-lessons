package ua.lviv.lgs.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import ua.lviv.lgs.task1.Application.Months;

public class Application {
	
	public static void main(String[] args) {
		
//		private static Integer[] array;
		int size1=getRandomValueFromRange(1, 5);
		int size2=getRandomValueFromRange(1, 5);
//		array =new Integer[size];
		Car[][] arrayOfCar = new Car[size1][size2];
		for (int i=0;i<size1;i++) {
			for (int j=0;j<size2;j++) {
				arrayOfCar[i][j]=new Car(getRandomValueFromRange(5, 15),getRandomValueFromRange(25, 35));
		}}
		System.out.println(Arrays.deepToString(arrayOfCar));
		System.out.println(Arrays.deepToString(arrayOfCar[1]));
		
		menu();
		 Scanner sc = new Scanner(System.in);
		 String x=sc.next();
//		 System.out.println(arrayOfCar[1][1].getHorsepower());
			switch (x) {
			case "1": {
				System.out.println(Arrays.deepToString(arrayOfCar));
				break;
			}
			case "2": {
//				for (Car[] rows: arrayOfCar) {
//				    Arrays.fill(rows, 45);}
				
				Arrays.fill(arrayOfCar[1], 88);
				
				
//				for (int i=0;i<size1;i++) {
//					for (int j=0;j<size2;j++) {
//					arrayOfCar[i][j].setHorsepower(99);
//				}}
				System.out.println(Arrays.deepToString(arrayOfCar));
					break;
				}
			case "3": {
				Arrays.sort(arrayOfCar[1]);
				System.out.println(Arrays.deepToString(arrayOfCar));
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
