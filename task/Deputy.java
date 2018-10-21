package ua.lviv.lgs.task;

import java.util.Comparator;

public class Deputy extends Person implements Comparator<Deputy> {

	private String lastName;
	private String firstName;
	private int age;
	private boolean bribeTaker;
	private int bribeSum;
	private String gun;

	public Deputy(int weight, int height, String gun) {
		super(weight, height, gun);

	}

	public Deputy(int weight, int height, String watch, String lastName, String firstName, int age, boolean bribeTaker,
			String gun) {
		super(weight, height, watch);

		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.bribeTaker = bribeTaker;
		// this.bribeSum = bribeSum;
		this.gun = gun;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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

	public int getBribeSum() {
		return bribeSum;
	}

	public void setBribeSum(int bribeSum) {
		this.bribeSum = bribeSum;
	}

	public String getGun() {
		return gun;
	}

	public void setGun(String gun) {
		this.gun = gun;
	}

	@Override
	public String toString() {
		return "\n\tLastName=" + lastName + ", firstName=" + firstName + ", age=" + age + "\n\t\tbribeTaker="
				+ bribeTaker + ", bribeSum=" + bribeSum + ", gun=" + gun + ", Weight=" + getWeight() + ", Height="
				+ getHeight() + ", Watch=" + getWatch();
	}

	public void bribe(int br) {
		if (bribeTaker) {
			System.out.println(bribeSum);
			bribeSum += br;
			if (br > 5000)
				System.out.println("Поліція увязнить депутата");
		} else {
			System.out.println("Цей депутат не бере хабарів");
		}
	}

	@Override
	public int compare(Deputy o) {

		if (this.bribeSum > o.getAge()) {
			return 1;
		} else if (this.bribeSum < o.getAge()) {
			return -1;
		}

		return 0;
	}

	@Override
	public int compare(Deputy o1, Deputy o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
