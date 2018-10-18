package ua.lviv.lgs.task1;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Application {

	static String[] helmMaterial = new String[] { "skin    ", "alkantera" };

	public static void main(String[] args) {
		int size = getRandomValueFromRange(10, 100);
		List<Car> list = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			list.add(new Car(getRandomValueFromRange(50, 500), getRandomValueFromRange(1900, 2018),
					new Engine(getRandomValueFromRange(1, 8)), new Helm(getRandomValueFromRange(30, 50),
							helmMaterial[getRandomValueFromRange(0, helmMaterial.length - 1)])));
		}
		menu();

		Scanner sc = new Scanner(System.in);
		String x = sc.next();

		switch (x) {
		case "1": {
			for (Object object : list) {
				System.out.println(object);
			}
			break;
		}
		case "2": {
			for (int i = 0; i < size; i++) {
				System.out.println("old " + list.get(i));
				list.get(i).setHorsepower(list.get(i).getHorsepower() / 5);
				System.out.println("new " + list.get(i));
			}
			break;
		}
		case "3": {

			Collections.sort(list, new AscendingCarComparartor());
			System.out.println("After sorting Ascending");
			for (Car car : list) {
				System.out.println(car);
			}
			break;
		}
		case "4": {
			Collections.sort(list, new DescendingCarComparartor());
			System.out.println("After sorting Ascending");
			for (Car car : list) {
				System.out.println(car);
			}
			break;
		}
		}
	}

	static void menu() {

		System.out.println("Tap 1 to print list");
		System.out.println("Tap 2, to change horsepower");
		System.out.println("Tap 3 to sort ");
		System.out.println("Tap 4 to sort desc");
	}

	public static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("min value must be smaller than max value");
		}

		Random r = new Random();
		return r.nextInt(max - min + 1) + min; // 1-10
	}

}

class AscendingCarComparartor implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {

		if (o1.getYear() > o2.getYear()) {
			return 1;
		} else if (o1.getYear() < o2.getYear()) {
			return -1;
		} else {
			if (o1.getHorsepower() > o2.getHorsepower()) {
				return 1;
			} else if (o1.getHorsepower() < o2.getHorsepower()) {
				return -1;
			} else {

				if (o1.getEngine().getNumberOfCylinders() > o2.getEngine().getNumberOfCylinders()) {
					return 1;
				} else if (o1.getEngine().getNumberOfCylinders() < o2.getEngine().getNumberOfCylinders()) {
					return -1;
				} else {

					if (o1.getHeml().getMaterial().compareTo(o2.getHeml().getMaterial()) > 0) {
						return 1;
					} else if (o1.getHeml().getMaterial().compareTo(o2.getHeml().getMaterial()) < 0) {
						return -1;
					} else {

						if (o1.getHeml().getDiametr() > o2.getHeml().getDiametr()) {
							return 1;
						} else if (o1.getHeml().getDiametr() < o2.getHeml().getDiametr()) {
							return -1;
						}
					}
				}
			}
		}

		// zero means that objects are equal
		return 0;
	}

}

class DescendingCarComparartor implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		AscendingCarComparartor ascendingComparator = new AscendingCarComparartor();
		return (-1) * ascendingComparator.compare(o1, o2);
	}

}