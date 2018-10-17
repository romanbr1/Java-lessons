package ua.lviv.lgs.task1;

public class Car {
private int horsepower;
private int year;
private Helm heml;
private Engine engine;

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
public Helm getHeml() {
	return heml;
}
public void setHeml(Helm heml) {
	this.heml = heml;
}
public Engine getEngine() {
	return engine;
}
public void setEngine(Engine engine) {
	this.engine = engine;
}
@Override
public String toString() {
	return "Car [horsepower=" + horsepower + ", year=" + year + "]";
}



}
