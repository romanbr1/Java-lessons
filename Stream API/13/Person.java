package ua.lviv.lgs;

public class Person {

	private double weight;
	private double height;
	
	public Person(double weight, double height) {
	
		this.weight = weight;
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return " Weight = " + weight + " Height = " + height ;
	}
	
	
	
}
