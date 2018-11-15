package ua.lviv.lgs;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		MainRada mr = MainRada.createMainRada();
		mr.adD();;
		while (true) {
			
			Menu();
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			switch (number) {

			case 1: {
				mr.addFraction();
				break;
			}
			case 2: {
				mr.removeFraction();
				break;
			}
			case 3: {
				mr.cleanFraction();
				break;

			}

			case 4: {
				mr.showFractions();
				break;

			}
			case 5: {
				mr.showFraction();
				break;
			}
			case 6: {
				mr.addDeputate();
				break;

			}
			case 7: {
				mr.removeDeputate();
				break;

			}
			case 8: {
				mr.showBribeTakers();
				break;

			}
			case 9: {
				mr.showMaxBriber();
				break;

			}
			

			default: {
				System.out.println("No such Number!");
			}
				return;
			}

		}

	}

	static void Menu(){
		System.out
		.println("\n--------------------\n"
				+ "\n1. Add fraction"
				+ "\n2. Remove fraction"
				+ "\n3. Clean fraction"
				+ "\n4. Show fractions"
				+ "\n5. Show fraction"
				+ "\n6. Add Depute"
				+ "\n7. Remove depute"
				+ "\n8. Show brirber takers "
				+ "\n9. Show max briber taker� "
				+ "\n--------------------\n"
				);


	}
}
