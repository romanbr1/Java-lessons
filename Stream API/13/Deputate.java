package ua.lviv.lgs;

import java.util.Scanner;

public class Deputate extends Person {
	private String firstName;
	private String lastName;
	private int age;
	private boolean bribeTaker;
	private int briber;

	public Deputate(double weight, double height, String firstName, String lastName, int age, boolean bribeTaker) {
		super(weight, height);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.bribeTaker = bribeTaker;
	}

	public Deputate(double weight, double height, String firstName, String lastName, int age, boolean bribeTaker,
			int briber) {
		super(weight, height);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.bribeTaker = bribeTaker;
		this.briber = briber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBribeTaker() {
		return bribeTaker;
	}

	public void setBribeTaker(boolean bribeTaker) {
		this.bribeTaker = bribeTaker;
	}

	@Override
	public String toString() {
		return "FirstName = " + firstName + "LastName = " + lastName + "Age = " + age + "BribeTaker = " + bribeTaker
				+ super.toString();
	}

	public void takeBriber() {
		if (!bribeTaker) {
			System.out.println("Цей депутат не бере хабарів.");
		} else {
			System.out.println("Введіть суму хабаря");
			Scanner sc = new Scanner(System.in);
			int briber = sc.nextInt();
			if (briber > 3000) {
				System.out.println("Поліція заарештує депутата");
				this.briber = briber;
			} else {
				if (briber > 0) {
					this.briber = briber;
				} else {
					System.out.println("Хабарники не віддають грошей");
				}

			}
		}
	}

	public int getBriber() {
		return briber;
	}

	public void setBriber(int briber) {
		this.briber = briber;
	}

}
