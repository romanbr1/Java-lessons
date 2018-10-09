package ua.lviv.lgs.task1;

import java.time.Month;
import java.util.Scanner;

public class Application {

	enum Seasons {
		WINTER, SPRING, SUMMER, AUTUMN;
	}

	enum Months {
		JANUARY(Seasons.WINTER, 31), FEBRUARY(Seasons.WINTER, 28), MARCH(Seasons.SPRING, 31), APRIL(Seasons.SPRING, 30),
		MAY(Seasons.SPRING, 31), JUNE(Seasons.SUMMER, 30), JULY(Seasons.SUMMER, 31), AUGUST(Seasons.SUMMER, 31),
		SEPTEMBER(Seasons.AUTUMN, 30), OCTOBER(Seasons.AUTUMN, 31), NOVEMBER(Seasons.AUTUMN, 30),
		DECEMBER(Seasons.WINTER, 31);
		Months month;

		Seasons season;
		int days;

		private Months(Seasons season, int days) {
			this.season = season;
			this.days = days;
		}

		public Months getMonth() {
			return month;
		}

		public Seasons getSeason() {
			return season;
		}

		public int getDays() {
			return days;
		}
	}

	static void menu() {
		System.out.println ("Tap 1 to check if such a month exists");
		System.out.println ("Tap 2, Display all months with the same time of year");
		System.out.println ("Tap 3 to Print all months with the same number of days");
		System.out.println ("Quit 4 to display all months with fewer days");
		System.out.println ("Tap 5 to display all the months that have more days");
		System.out.println ("Tap 6 to display next year");
		System.out.println ("Tap 7 to display the previous year");
		System.out.println ("Tap 8 to display all the months that have a pair of days");
		System.out.println ("Tap 9 to display all the months that have an odd number of days");
		System.out.println ("Tap 0 to display the console or the month has a couple of days");
	}

	public static void main(String[] args) {

		Months[] mas = Months.values();
		Seasons[] se = Seasons.values();
		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();

			switch (sc.next()) {
			case "0": {
				System.out.println("Enter month");
				sc = new Scanner(System.in);
				String monthx = sc.next().toUpperCase();
				boolean flag = isMonthsPresent(mas, monthx);

				for (Months m : mas) {
					if (m.name().equals(monthx)) {
						System.out.println(m.days);
						if (m.days % 2 == 0) {
							System.out.println("pair");
							flag = true;
						} else {
							System.out.println("odd");
						}
					}
				}
				if (!flag) {
					System.out.println("M4onth doesnt exit");
				}
				break;
			}

			case "1": {
				System.out.println("Enter month");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();

				boolean flag = isMonthsPresent(mas, month);

				if (!flag) {
					System.out.println("M4onth doesnt exit");
				}
				break;
			}

			case "2": {
				System.out.println("Enter season");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();

				boolean flag = false;

				for (Months m : mas) {
					if (m.getSeason().name().equals(month)) {
						flag = true;
					}
				}

				if (flag) {
					Seasons mon = Seasons.valueOf(month);

					for (Months m : mas) {
						if (m.getSeason().toString().equalsIgnoreCase(month)) {
							System.out.println(m);
						}
					}
				}

				if (!flag) {
					System.out.println("Season doesnt exit");
				}
				break;
			}
			case "3": {
				System.out.println("Enter days");
				sc = new Scanner(System.in);
				int days = sc.nextInt();
				if ((days < 27) || (days > 31)) {
					System.out.println("enter correct value");
				}
				for (Months m : mas) {
					if (m.getDays() == days) {
						System.out.println(m);
					}
				}
				break;
			}
			case "4": {
				System.out.println("Enter days");
				sc = new Scanner(System.in);
				int days = sc.nextInt();
				if (days < 28) {
					System.out.println("enter correct value");
				}
				for (Months m : mas) {
					if (m.getDays() <= days) {
						System.out.println(m);
					}
				}
				break;
			}
			case "5": {
				System.out.println("Enter days");
				sc = new Scanner(System.in);
				int days = sc.nextInt();
				if (days > 31) {
					System.out.println("enter correct value");
				}
				for (Months m : mas) {
					if (m.getDays() > days) {
						System.out.println(m);
					}
				}
				break;
			}
			case "6": {
				System.out.println("Enter season");
				sc = new Scanner(System.in);
				String season = sc.next().toUpperCase();

				boolean flag = isSeasonPresent(se, season);

				if (flag) {
					Seasons se2 = Seasons.valueOf(season);
					int ordinal = se2.ordinal();

					if (ordinal == (se.length - 1)) {
						ordinal = 0;
						System.out.println(se[ordinal]);
					} else {
						System.out.println(se[ordinal + 1]);
					}
				}

				if (!flag) {
					System.out.println("se2 doesnt exit");
				}
				break;
			}
			case "7": {
				System.out.println("Enter season");
				sc = new Scanner(System.in);
				String season = sc.next().toUpperCase();

				boolean flag = isSeasonPresent(se, season);

				if (flag) {
					Seasons se2 = Seasons.valueOf(season);
					int ordinal = se2.ordinal();
					if (ordinal == 0) {
						ordinal = se.length - 1;
						System.out.println(se[ordinal]);
					} else {
						System.out.println(se[ordinal - 1]);
					}
				}

				if (!flag) {
					System.out.println("se2 doesnt exit");
				}
				break;
			}

			case "8": {
				for (Months m : mas) {
					if (m.getDays() % 2 == 0) {
						System.out.println(m);
					}
				}
				break;
			}
			case "9": {
				for (Months m : mas) {
					if (m.getDays() % 2 == 1) {
						System.out.println(m);
					}
				}
				break;
			}

			}

		}

	}

	private static boolean isMonthsPresent(Months[] mas, String month) {
		boolean flag = false;

		for (Months m : mas) {

			if (m.name().equals(month)) {
				System.out.println("Months exist");
				flag = true;
			}
		}
		return flag;
	}

	private static boolean isSeasonPresent(Seasons[] mas, String season) {
		boolean flag = false;

		for (Seasons s : mas) {

			if (s.name().equals(season)) {
				System.out.println("Season exist");
				flag = true;
			}
		}
		return flag;
	}

}
