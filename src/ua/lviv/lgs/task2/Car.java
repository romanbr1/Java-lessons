package ua.lviv.lgs.task2;

public class Car {
private int horsepower;
private int year;
public Car(int horsepower, int year) {
	super();
	this.horsepower = horsepower;
	this.year = year;
}
public int getHorsepower() {
	return horsepower;
}
public void setHorsepower(int horsepower) {
	this.horsepower = horsepower;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
@Override
public String toString() {
	return "Car [horsepower=" + horsepower + ", year=" + year + "]";
}

}
