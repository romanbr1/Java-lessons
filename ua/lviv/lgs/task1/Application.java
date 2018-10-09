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
		System.out.println("Натичніть 1, щоб перевірити чи такий місяць існує");
		System.out.println("Натичніть 2, Вивести всі місяці з такою ж порою року");
		System.out.println("Натичніть 3, щоб Вивести всі місяці які мають таку саму кількість днів");
		System.out.println("Натичніть 4, щоб Вивести на екран всі місяці які мають меншу кількість днів");
		System.out.println("Натичніть 5, щоб Вивести на екран всі місяці які мають більшу кількість днів");
		System.out.println("Натичніть 6, щоб Вивести на екран наступну пору року");
		System.out.println("Натичніть 7, щоб Вивести на екран попередню пору року");
		System.out.println("Натичніть 8, щоб Вивести на екран всі місяці які мають парну кількість днів");
		System.out.println("Натичніть 9, щоб Вивести на екран всі місяці які мають непарну кількість днів");
		System.out.println("Натичніть 0, щоб Вивести на екран чи введений з консолі місяць має парну кількість днів");
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
